package neusoft.sawyer.learn.aop;

import neusoft.sawyer.learn.aop.service.AnnotationService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Created by sawyer on 2018/5/29.
 * SpringAOP
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AnnotationTest {

    @Resource
    private AnnotationService annotationService;

    @Test
    public void test() {
        this.annotationService.methodAnnotation();
    }
}
