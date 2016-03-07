package work.nich.retrofit2demo.utils;

import android.app.Application;
import android.content.Context;

import com.orhanobut.logger.Logger;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import work.nich.retrofit2demo.App;

/**
 * Created by nich- on 2016/3/1.
 * 这是一个Retrofit的单例类（这不废话么...）
 */
public class RetrofitUtil {

    public static final String API_HOST = OneApi.OneBaseUrl;

    public static OneAPIService service;
    public static Retrofit retrofit;

    public static OneAPIService getService() {
        if (service == null) {
            service = getRetrofit().create(OneAPIService.class);
        }
        return service;
    }


    public static Retrofit getRetrofit() {

        if (retrofit == null) {
            OkHttpClient okClient = new OkHttpClient.Builder()
                    .addInterceptor(new Interceptor() {
                        @Override
                        public Response intercept(Chain chain) throws IOException {
                            // 拦截获取requestData
                            Response response = chain.proceed(chain.request());
                            Logger.d("Request Data", response.body().toString());
                            return response;
                        }
                    })
                    .build();

            retrofit = new Retrofit.Builder()
                    .baseUrl(API_HOST)
                    // 为添加拦截而自定义一个okClient，不用可忽略
                    .client(okClient)
                    // 需要用gson来将获取到的数据转化
                    .addConverterFactory(GsonConverterFactory.create())
                    // 添加RxJava支持
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
