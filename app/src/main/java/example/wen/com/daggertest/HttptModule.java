package example.wen.com.daggertest;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Created by wen on 2017/11/9.
 */
@Module
public class HttptModule {

    @Provides
    OkHttpClient providesHttp(){
        return new OkHttpClient.Builder().build();
    }
}
