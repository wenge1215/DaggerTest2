package example.wen.com.daggertest;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by wen on 2017/11/8.
 * 提供依赖的管理器
 */
@Module
public class UserModule {

    private Context mContext;

    public UserModule(Context context) {
        mContext = context;
    }


    /**
     * 提供依赖
     *
     * @return
     */
    @Provides
    protected ApiServer providerApiServer() {
        return new ApiServer(mContext);
    }

    @Provides
    protected UserStore providerUserStore() {
        return new UserStore(mContext);
    }

    @Provides
    public Person providesPersion(){
        return new Person();
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
