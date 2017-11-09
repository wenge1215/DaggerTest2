package example.wen.com.daggertest;

import dagger.Component;

/**
 * Created by wen on 2017/11/8.
 * 注入器（提供依赖的桥梁）
 */
@Component(modules = {UserModule.class,HttptModule.class})
public interface UserComponet {
    /**
     * 与activity关联
     *
     * @param activity 需要注入的对象
     */
    void inject(MainActivity activity);

}
