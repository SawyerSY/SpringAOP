package neusoft.sawyer.learn.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by sawyer on 2018/5/29.
 */
@Aspect
@Component
public class ObjectAspectConfig {

    @Pointcut("this(neusoft.sawyer.learn.aop.service.Loggable)")
    public void matchCondition() {

    }

    @Pointcut("bean(logService)")
    public void matchCondition1() {

    }

    @Before("matchCondition()")
    public void before() {
        System.out.println("[neusoft.sawyer.learn.aop.aspect.ObjectAspectConfig]Before");
    }

    @After("matchCondition1()")
    public void after() {
        System.out.println("[neusoft.sawyer.learn.aop.aspect.ObjectAspectConfig]After");
    }
}
