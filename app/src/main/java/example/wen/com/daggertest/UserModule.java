package example.wen.com.daggertest;

import android.content.Context;
import android.util.Log;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;

/**
 * Created by wen on 2017/11/8.
 * 提供依赖的管理器
 */
@Module/*(includes = HttptModule.class)*/
public class UserModule {

    private Context mContext;
    private static final String TAG = "UserModule";


    public UserModule(Context context) {
        mContext = context;
    }


    /**
     * 提供依赖
     *
     * @return
     */


    @Provides
    @Test
    protected ApiServer providerApiServerForDev(OkHttpClient okHttpClient) {
        Log.e(TAG,"Test:     "+okHttpClient.hashCode());
        return new ApiServer(okHttpClient);
    }


    @Release
    @Provides
    protected ApiServer providerApiServerForRelease(OkHttpClient okHttpClient) {
        Log.e(TAG,"Release:     "+okHttpClient.hashCode());
        return new ApiServer(okHttpClient);
    }

    @Provides
    ApiServer providerApiServer(OkHttpClient okHttpClient) {
        Log.e(TAG,"     "+okHttpClient.hashCode());
        return new ApiServer(okHttpClient);
    }

    @Provides
    protected UserStore providerUserStore() {
        return new UserStore(mContext);
    }

    @Provides
    public Person providesPersion() {
        return new Person();
    }

    @Provides
    String providerStr() {
        return "如果需要提供的对象包含参数";
    }

    /**
     * 如果需要提供的对象包含参数，就需要提供对应提供参数的方法
     * 如上面两个方法
     *
     * @param apiServer 通过providerApiServer() 方法提供
     * @param userStore 通过providerUserStore() 方法提供
     * @return
     */
    @Provides
    protected UserManager providerUserMamager(ApiServer apiServer, UserStore userStore) {
        return new UserManager(apiServer, userStore);
    }
}
