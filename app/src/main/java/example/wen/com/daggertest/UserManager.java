package example.wen.com.daggertest;

import javax.inject.Inject;
import javax.inject.Singleton;


/**
 * Created by wen on 2017/11/8.
 */

public class UserManager {

    private String TAG = "UserManager";

    ApiServer mApiServer;
    UserStore mUserStore;

    @Inject
    public UserManager(ApiServer apiServer, UserStore userStore) {
        mApiServer = apiServer;
        mUserStore = userStore;
    }


    public void loge() {
        System.out.println( mApiServer.getClass().getName() + "     " + mUserStore.getClass().getName());
    }

}
