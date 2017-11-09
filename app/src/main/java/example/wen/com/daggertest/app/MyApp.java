package example.wen.com.daggertest.app;

import android.app.Application;
import android.content.SharedPreferences;

import javax.inject.Inject;

/**
 * Created by WENGE on 2017/11/9.
 * 备注：
 */


public class MyApp extends Application {
    @Inject
    SharedPreferences mSharedPreferences;

    @Override
    public void onCreate() {
        super.onCreate();
        AppComponet build = DaggerAppComponet.builder().appModule(new AppModule(this)).build();
        build.inject(this);
    }
}
