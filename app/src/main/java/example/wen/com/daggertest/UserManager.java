package example.wen.com.daggertest;

import javax.inject.Inject;

/**
 * Created by wen on 2017/11/8.
 */

public class UserManager {
    ApiServer mApiServer;
    UserStore mUserStore;

    @Inject
    public UserManager(ApiServer apiServer, UserStore userStore) {
        mApiServer = apiServer;
        mUserStore = userStore;
    }
}
