package work.nich.retrofit2demo;

import android.app.Application;
import android.content.Context;

/**
 * Created by nich- on 2016/3/1.
 */
public class App extends Application {

    public static Context context;
    public static App mApp;

    synchronized public static App getApplication() {
        return mApp;
    }

    synchronized public static Context getAppContext() {
        return mApp.getApplicationContext();
    }

}
