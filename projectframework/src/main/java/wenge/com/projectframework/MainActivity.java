package wenge.com.projectframework;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import wenge.com.projectframework.databinding.LayoutTestBinding;

public class MainActivity extends AppCompatActivity {
    private UserBean mUserBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LayoutTestBinding viewDataBinding = DataBindingUtil.setContentView(this, R.layout.layout_test);
        mUserBean = new UserBean();
        viewDataBinding.setUser(mUserBean);
        viewDataBinding.setClick(this);
        viewDataBinding.setImageUrl("http://images.csdn.net/20150810/Blog-Image%E5%89%AF%E6%9C%AC.jpg");

    }

    public void click(View view){
        String name = mUserBean.getName();
        String id = mUserBean.getId();
        int age = mUserBean.getAge();
        Toast.makeText(this,name+"   " +id+"    "+age,Toast.LENGTH_LONG).show();
    }
}
