package example.wen.com.daggertest;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Created by wen on 2017/11/9.
 */
@Module
public class HttptModule {


    @Provides
//    @Singleton
    @ParActivity
    OkHttpClient providesHttp() {
        return new OkHttpClient.Builder().build();
    }
}
