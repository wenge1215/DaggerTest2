package wenge.com.projectframework;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

/**
 * Created by wen on 2017/11/22.
 */

public class Imageloader {
    @BindingAdapter({"bind:image"})
    public static void imageLoader(ImageView imageView, String url) {
        ImageLoaderUtils.getInstance().displayImage(url, imageView);
    }
}
