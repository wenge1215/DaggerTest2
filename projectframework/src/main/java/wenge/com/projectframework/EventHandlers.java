package wenge.com.projectframework;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by wen on 2017/11/22.
 */

public class EventHandlers {
    public void handleClick(View view) {
        Toast.makeText(view.getContext(), ((TextView)view).getText(), Toast.LENGTH_LONG).show();
    }
}
