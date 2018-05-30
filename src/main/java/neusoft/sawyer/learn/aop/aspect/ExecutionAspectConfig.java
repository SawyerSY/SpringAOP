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
public class ExecutionAspectConfig {

    /*
     * 权限修饰符 返回值 包名 方法
     * */
    @Pointcut("execution(public * neusoft.sawyer.learn.aop.service.*Service.*(..) throws IllegalAccessException)")
    public void matchCondition() {

    }

    @Before("matchCondition()")
    public void device() {
        System.out.println("neusoft.sawyer.learn.aop.aspect.ExecutionAspectConfig.device: Before");
    }
}
