package example.wen.com.daggertest;

import dagger.Module;
import dagger.Provides;

/**
 * Created by wen on 2017/11/8.
 * 通过依赖的管理器
 */
@Module
public class UserModule {


    /**
     * 提供依赖
     *
     * @return
     */
    @Provides
    public ApiServer providerApiServer() {
        return new ApiServer();
    }

    @Provides
    public UserManager providerUserMamager(ApiServer apiServer, UserStore userStore) {
        return new UserManager(apiServer, userStore);
    }
}
