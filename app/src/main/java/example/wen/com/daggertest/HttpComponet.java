package example.wen.com.daggertest;

import dagger.Component;

/**
 * Created by wen on 2017/11/9.
 * 模块化实现的三种方式
 * 1.@Module(includes = HttptModule.class)  通过includes
 * 2.@Component(modules = {UserModule.class,HttptModule.class})  再module的花括号中添加
 * 3.当前方法，重先定义一个Component，@Component(modules = HttptModule.class,dependencies = {})
 * 通过 dependencies = {.Class} 来引用
 */
//@Component(modules = HttptModule.class)
public interface HttpComponet {

}
