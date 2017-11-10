package example.wen.com.daggertest;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by WENGE on 2017/11/10.
 * 备注：
 */

@Scope
@Documented
@Retention(RUNTIME)
public @interface ParApp {
}
