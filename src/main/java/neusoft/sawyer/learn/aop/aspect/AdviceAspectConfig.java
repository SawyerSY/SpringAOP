package neusoft.sawyer.learn.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by sawyer on 2018/5/29.
 */
@Aspect
@Component
public class AdviceAspectConfig {

    @Pointcut("within(neusoft.sawyer.learn.aop..*)")
    public void device() {

    }

    @After("device()")
    public void after() {
        System.out.println("neusoft.sawyer.learn.aop.aspect.AdviceAspectConfig.after");
    }
}
