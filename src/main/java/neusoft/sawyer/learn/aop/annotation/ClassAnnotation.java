package neusoft.sawyer.learn.aop.annotation;

import java.lang.annotation.*;

/**
 * Created by sawyer on 2018/5/29.
 *
 * 类级别注解，支持被继承
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface ClassAnnotation {
}
