package neusoft.sawyer.learn.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by sawyer on 2018/5/29.
 */
@Aspect
@Component
public class DesignatorAspectConfig {

    @Pointcut("within(neusoft.sawyer.learn.aop.service.*)")
    public void matchType() {

    }

    @Before("matchType()")
    public void before() {
        System.out.println("[neusoft.sawyer.learn.aop.aspect.DesignatorAspectConfig]Before");
    }
}
