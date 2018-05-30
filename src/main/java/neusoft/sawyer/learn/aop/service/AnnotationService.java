package neusoft.sawyer.learn.aop.service;

import neusoft.sawyer.learn.aop.annotation.ClassAnnotation;
import neusoft.sawyer.learn.aop.annotation.MethodAnnotation;
import org.springframework.stereotype.Service;

/**
 * Created by sawyer on 2018/5/29.
 * SpringAOP
 */
@Service
@ClassAnnotation
public class AnnotationService {

    @MethodAnnotation
    public void methodAnnotation() {
        System.out.println("method annotation");
    }
}
