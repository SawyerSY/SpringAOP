package neusoft.sawyer.learn.aop.aspect;

import neusoft.sawyer.learn.aop.service.AuthService;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by sawyer on 2018/5/29.
 */
@Aspect
@Component
public class SecurityAspectConfig {

    @Resource
    private AuthService authService;

    /*
     * Pointcut：切面表达式
     * */
    @Pointcut("@annotation(neusoft.sawyer.learn.aop.annotation.AdminOnlyAnnotation)")
    public void adminOnly() {
    }

    /*
     * Advice：织入时机及触发方法（5种）
     * */
    @Before("adminOnly()")
    public void check() {
        this.authService.checkAccess();
    }
}
