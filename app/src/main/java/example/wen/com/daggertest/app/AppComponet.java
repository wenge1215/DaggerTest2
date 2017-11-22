package example.wen.com.daggertest.app;

import android.content.Context;
import android.content.SharedPreferences;

import dagger.Component;
import example.wen.com.daggertest.ParApp;

/**
 * Created by WENGE on 2017/11/9.
 * 备注：
 */
@ParApp
@Component(modules = {AppModule.class})
public interface AppComponet {
    void inject(Context application);

    /**
     * 对应APPModule中的@Provider方法，不添加以下方法会报错
     * Error:(20, 10) 错误: android.content.SharedPreferences cannot be provided without an @Provides- or @Produces-annotated method.
     * 但是在APPModule中已经添加聊@Provides的方法了
     *
     * @return
     */
    SharedPreferences getSp();

    Context getAppContext();

    /**
     * dagger2是通过返回值来确定类型的，如果两个方法返回的类型相同，也会报错：
     * Error:(20, 10) 错误: android.content.SharedPreferences is bound multiple times:
     * android.content.SharedPreferences example.wen.com.daggertest.app.AppComponet.getSp()
     * android.content.SharedPreferences example.wen.com.daggertest.app.AppComponet.setSP()
     *
     * @return
     */
//    SharedPreferences setSP();

}
