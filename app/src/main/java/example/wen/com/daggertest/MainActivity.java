package example.wen.com.daggertest;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import javax.inject.Inject;
import javax.inject.Provider;

import dagger.Lazy;
import example.wen.com.daggertest.app.MyApp;

public class MainActivity extends AppCompatActivity {
    private String TAG = "MainActivity";
//

    //    @Named("dev")
    @Test
    @Inject
    ApiServer mApiServer_dev;

    //    @Named("release")
    @Release
    @Inject
//    ApiServer mApiServer_release;
            Lazy<ApiServer> mApiServerLazy;             //懒加载

    @Release
    @Inject
    Provider<ApiServer> mApiServerProvider;


    @Inject
    UserManager mUserManager;

    @Inject
    SharedPreferences mSharedPreferences;
    @Inject
    Context mContext;


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
                .appComponet((MyApp.mAppComponet))
                .httptModule(new HttptModule())
                .userModule(new UserModule(this))
                .build()
                .inject(this);
//        mUserManager.loge();

        Log.e(TAG, mApiServer_dev.getClass().getName() + "----" + mApiServer_dev.hashCode());
//        Log.e(TAG, mApiServer_release.getClass().getName() + "----" + mApiServer_release.hashCode());
        Log.e(TAG, mSharedPreferences.getClass().getName() + "----" + mSharedPreferences.hashCode());
        Log.e(TAG, mContext.getClass().getName() + "----" + mContext.hashCode());
        Log.e(TAG, mApiServerLazy.getClass().getName() + "----" + mApiServerLazy.hashCode());

        /**
         * 懒加载，只有调用get()方法才会被创建
         * 以后每次调用，获取的都是同一个对象
         */
        mApiServerLazy.get().register();


        /**
         * 调用该方法是才会去创建，以后每次调用都会重新加载Module中的具体方法，根据Module中的实现，可能相同，可能不相同。
         */
        mApiServerProvider.get().register();


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
