package example.wen.com.daggertest.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import example.wen.com.daggertest.R;

public class AppActivity extends AppCompatActivity {
//    @Inject
//    SharedPreferences mSharedPreferences;
//    @Inject
//    Context mApplication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);
//
//        DaggerAppComponet.builder()
//                .appModule(new AppModule(getApplicationContext()))
//                .build()
//                .inject(getApplication());
//
//        System.out.print(mSharedPreferences.getClass().getName() + "\r\n" + mApplication.getClass().getName());

    }
}
