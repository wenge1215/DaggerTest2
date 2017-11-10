package example.wen.com.daggertest.app;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import javax.inject.Inject;

/**
 * Created by WENGE on 2017/11/9.
 * 备注：
 */


public class MyApp extends Application {
    @Inject
    SharedPreferences mSharedPreferences;
    @Inject
    Context mApplication;
    public static  AppComponet mAppComponet;

    @Override
    public void onCreate() {
        super.onCreate();

        mAppComponet = DaggerAppComponet.builder()
                .appModule(new AppModule(getApplicationContext()))
                .build();
        mAppComponet.inject(this);
    }
}
