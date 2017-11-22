package wenge.com.projectframework;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by wen on 2017/11/22.
 */

public class UserBean  extends BaseObservable{
    String name;
    String id;
    int age;

    public UserBean() {
    }

    public UserBean(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }
    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
