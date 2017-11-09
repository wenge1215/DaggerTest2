package example.wen.com.daggertest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {
    private String TAG = "MainActivity";
//
    @Inject
    UserManager mUserManager;

//    @Named("dev")
    @Test
    @Inject
    ApiServer mApiServer_dev;

//    @Named("release")
////    @Release
//    @Inject
//    ApiServer mApiServer_release;

//    @Inject
//    UserManager mUserManager;
//
//    @Inject
//    UserManager mUserManager2;

//    @Inject
//    Person mPerson;
//
//    @Inject
//    Person mPerson1;

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


        DaggerUserComponet.builder()
                .httptModule(new HttptModule())
                .userModule(new UserModule(this))
                .build()
                .inject(this);
        mUserManager.loge();

        Log.e(TAG, mApiServer_dev.getClass().getName() + "----" + mApiServer_dev.hashCode());
//        Log.e(TAG, mApiServer_release.getClass().getName() + "----" + mApiServer_release.hashCode());


//
//        /**
//         * 通过添加别名来区别当前对象
//         * 有利于测试
//         */
//        if (true) {
//            mApiServer_dev.register();
//        } else {
//            mApiServer_release.register();
//        }

//
//        DaggerUserComponet.builder()
//                .userModule(new UserModule(this))
//                .build()
//                .inject(this);
//
//        mPerson.output();
    }
}
