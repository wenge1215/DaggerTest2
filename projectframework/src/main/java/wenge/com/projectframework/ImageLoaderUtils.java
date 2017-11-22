package wenge.com.projectframework;

import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by wen on 2017/11/22.
 */

public class ImageLoaderUtils {

    private static ImageLoaderUtils sInstance;

    public static ImageLoaderUtils getInstance() {
        if (sInstance == null) {
            synchronized (ImageLoaderUtils.class) {
                if (sInstance == null) {
                    sInstance = new ImageLoaderUtils();
                }
            }
        }
        return sInstance;
    }

    public void displayImage(String url, ImageView imageView) {
        Glide.with(imageView).load(url).into(imageView);
    }
}
