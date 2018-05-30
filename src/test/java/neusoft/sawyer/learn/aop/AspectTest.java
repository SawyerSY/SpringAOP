package neusoft.sawyer.learn.aop;

import neusoft.sawyer.learn.aop.service.ArgsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Created by sawyer on 2018/5/29.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AspectTest {

    @Resource
    private ArgsService argsService;

    @Test
    public void argsAspect() {
        this.argsService.argsLongMethod(1L);
    }

    @Test
    public void argsAspectTest() {
        this.argsService.argsLongMethod(1L, "", 1);
    }
}
