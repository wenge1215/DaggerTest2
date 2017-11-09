package example.wen.com.daggertest.app;

import android.content.Context;
import android.content.SharedPreferences;

import dagger.Module;
import dagger.Provides;

/**
 * Created by WENGE on 2017/11/9.
 * 备注：
 */

@Module
public class AppModule {
    private Context mApplication;

    public AppModule(Context application) {
        mApplication = application;
    }


    /**
     * 提供sp
     *
     * @return
     */
    @Provides
    public SharedPreferences provideSharedPreFerences() {
        return mApplication.getSharedPreferences("test_sp", Context.MODE_PRIVATE);
    }

    /**
     * 提供全局上下文
     *
     * @return
     */
    @Provides
    public Context provideContext() {
        return mApplication.getApplicationContext();
    }

    /**
     * 可以提供更多全局的对象
     * 如retrofit对象...
     */


}
