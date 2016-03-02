package work.nich.retrofit2demo.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.orhanobut.logger.LogLevel;
import com.orhanobut.logger.Logger;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;

import rx.functions.Action1;
import rx.schedulers.Schedulers;
import work.nich.retrofit2demo.Model.Article;
import work.nich.retrofit2demo.Model.Daily;
import work.nich.retrofit2demo.Model.Question;
import work.nich.retrofit2demo.R;
import work.nich.retrofit2demo.utils.OneAPIService;
import work.nich.retrofit2demo.utils.RetrofitUtil;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private Subscription subscription;
    private String date;
    private int row;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initLogger();
        initRequestDate();
    }

    private void initRequestDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        date = simpleDateFormat.format(new Date());
        row = 1;
    }

    private void initLogger() {
        Logger.init(TAG).logLevel(LogLevel.FULL);
    }

    @OnClick(R.id.request_daily_data)
    void requestDaily() {
        subscription = RetrofitUtil.getService().getDaily(date, row)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Action1<Daily>() {
                    @Override
                    public void call(Daily daily) {
                        Toast.makeText(getApplicationContext(), daily.getHpEntity().getStrContent(), Toast.LENGTH_LONG).show();
                    }
                });
    }

    @OnClick(R.id.request_article_data)
    void requestArticle() {
        subscription = RetrofitUtil.getService().getArticle(date, row)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Action1<Article>() {
                    @Override
                    public void call(Article article) {
                        Logger.d("article", article.getContentEntity().getStrContent());
                    }
                });
    }

    @OnClick(R.id.request_question_data)
    void requestQuestion() {
        subscription = RetrofitUtil.getService().getQuestion(date, row)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Action1<Question>() {
                    @Override
                    public void call(Question question) {
                        Logger.d("question", question.getTitle());
                    }
                });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (subscription.isUnsubscribed())
            subscription.unsubscribe();
    }
}
