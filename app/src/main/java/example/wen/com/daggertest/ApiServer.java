package example.wen.com.daggertest;

import android.content.Context;

import javax.inject.Inject;

/**
 * Created by wen on 2017/11/8.
 */

class ApiServer {
    private Context mContext;
    private static final String TAG = "ApiServer";

    @Inject
    public ApiServer(Context context) {
        this.mContext = context;
    }

    public void register() {
        System.out.println(this.getClass().getName()+"------"+this.hashCode());
    }
}
