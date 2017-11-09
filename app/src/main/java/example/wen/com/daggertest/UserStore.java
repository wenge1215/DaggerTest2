package example.wen.com.daggertest;

import android.content.Context;
import android.util.Log;


/**
 * Created by wen on 2017/11/8.
 */

public class UserStore {
    private static final String TAG = "UserStore";
    private final Context mContext;


    public UserStore(Context context) {
        this.mContext = context;
    }


    private void systemOut(String sys) {
        Log.e(TAG, sys);
    }
}
