package example.wen.com.daggertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

import dagger.Module;

@Module
public class MainActivity extends AppCompatActivity {
//
//    @Inject
//    ApiServer apiServer;

    @Inject
    UserManager mUserManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        DaggerUserComponet.create().inject(this);
//        apiServer.register();


    }
}
