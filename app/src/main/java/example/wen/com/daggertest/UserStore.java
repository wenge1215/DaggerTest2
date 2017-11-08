package example.wen.com.daggertest;

import android.util.Log;

import dagger.Module;
import dagger.Provides;


/**
 * Created by wen on 2017/11/8.
 */

public class UserStore {
    private static final String TAG = "UserStore";

    private void systemOut(String sys) {
        Log.e(TAG, sys);
    }
}
