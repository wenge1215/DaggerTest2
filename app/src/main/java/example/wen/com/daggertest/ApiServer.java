package example.wen.com.daggertest;

import okhttp3.OkHttpClient;

/**
 * Created by wen on 2017/11/8.
 */

class ApiServer {
    private static final String TAG = "ApiServer";
    OkHttpClient mOkHttpClient;

    /**
     * @Inject 提供公共的对象
     */
    public ApiServer(OkHttpClient mOkHttpClient) {
        this.mOkHttpClient = mOkHttpClient;
    }

    public void register() {
        System.out.println(this.getClass().getName() + "------" + this.hashCode() + "   " + mOkHttpClient.getClass().getName() + "----" + mOkHttpClient.hashCode());
    }


}
