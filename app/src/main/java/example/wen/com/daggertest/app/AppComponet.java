package example.wen.com.daggertest.app;

import android.app.Application;

import dagger.Component;

/**
 * Created by WENGE on 2017/11/9.
 * 备注：
 */

//@Component(modules = {AppModule.class})
public interface AppComponet {
    void inject(Application application) ;
}
