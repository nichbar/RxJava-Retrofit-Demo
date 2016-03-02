package work.nich.retrofit2demo.utils;


import java.util.List;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;
import work.nich.retrofit2demo.Model.Article;
import work.nich.retrofit2demo.Model.Daily;
import work.nich.retrofit2demo.Model.Question;

/**
 * Created by nich- on 2016/2/29.
 */
public interface OneAPIService {
    /**
     * 当天的首页
     */
    @GET("getHp_N")
    Observable<Daily> getDaily(@Query("strDate") String strDate, @Query("strRow") int strRow);

    /**
     * 当天的文章
     */
    @POST("getC_N")
    Observable<Article> getArticle(@Query("strDate") String strDate, @Query("strRow") int strRow);

    /**
     * 当天的问题
     */
    @POST("getQ_N")
    Observable<Question> getQuestion(@Query("strDate") String strDate, @Query("strRow") int count);
}
