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
public class AnnotationAspectConfig {

    @Pointcut("@annotation(neusoft.sawyer.learn.aop.annotation.MethodAnnotation)")
    public void annotation() {

    }

    @Pointcut("@within(neusoft.sawyer.learn.aop.annotation.ClassAnnotation) && within(neusoft.sawyer.learn.aop..*)")
    public void annotationAndWithIn() {

    }

    @Before("annotation()")
    public void advice() {
        System.out.println("[neusoft.sawyer.learn.aop.aspect.AnnotationAspectConfig]Before");
    }

    @After("annotationAndWithIn()")
    public void afterAdvice() {
        System.out.println("[neusoft.sawyer.learn.aop.aspect.AnnotationAspectConfig]After");
    }
}
