package example.wen.com.daggertest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private String TAG = "MainActivity";

//    @Inject
//    ApiServer apiServer;
//
//    @Inject
//    ApiServer mApiServer;
//
//    @Inject
//    UserManager mUserManager;

    //    @Inject
//    UserManager mUserManager;
//
//    @Inject
//    UserManager mUserManager2;

    @Inject
    Person mPerson;

    @Inject
    Person mPerson1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        /**
//         * 基本使用
//         */
//
//        DaggerUserComponet.create().inject(this);
//        apiServer.register();

//        DaggerUserComponet.builder().build().inject(this);
//        mUserManager.loge();


//        /**
//         * 一个参数的情况
//         */
//        DaggerUserComponet.builder()
//                .userModule(new UserModule(this))
//                .build()
//                .inject(this);
//        apiServer.register();
//        mApiServer.register();
//        mUserManager.loge();

        DaggerUserComponet.builder()
                .userModule(new UserModule(this))
                .build()
                .inject(this);

        mPerson.output();
    }
}
