package example.wen.com.daggertest;

import android.nfc.Tag;
import android.util.Log;

import javax.inject.Inject;

import dagger.Provides;

/**
 * Created by wen on 2017/11/8.
 */

class ApiServer {

    private static final String TAG = "ApiServer";

    public void register() {
        Log.d(TAG, "register");
    }
}
