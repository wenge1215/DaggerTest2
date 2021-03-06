package example.wen.com.daggertest;

/**
 * Created by wen on 2017/11/10.
 */

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Qualifier;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Qualifier   // 关键词
@Documented
@Retention(RUNTIME)  // 运行时仍可用
public @interface Test {
}
