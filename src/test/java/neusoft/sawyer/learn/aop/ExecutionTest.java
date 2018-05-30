package neusoft.sawyer.learn.aop;

import neusoft.sawyer.learn.aop.service.ExecutionService;
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
public class ExecutionTest {

    @Resource
    private ExecutionService executionService;

    @Test
    public void test() throws IllegalAccessException {
        this.executionService.test1("");
    }
}
