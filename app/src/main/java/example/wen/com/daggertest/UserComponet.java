package example.wen.com.daggertest;

import dagger.Component;
import example.wen.com.daggertest.app.AppComponet;

/**
 * Created by wen on 2017/11/8.
 * 注入器（提供依赖的桥梁）
 * <p>
 * <p>
 * 对于具有依赖关系的Component，不能使用相同的Scope，如果使用相同的会带来语意不明
 * 简言之，就是不要在两个Component中使用@Singleotn,要想实现单例，只能通过自定义注解，
 * 如：@ParActivity、@ParApp
 */


//@Singleton
@ParActivity
@Component(modules = {UserModule.class, HttptModule.class}, dependencies = AppComponet.class)
public interface UserComponet {
    /**
     * 与activity关联
     *
     * @param activity 需要注入的对象
     */
    void inject(MainActivity activity);

}
