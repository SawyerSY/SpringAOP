package neusoft.sawyer.learn.aop;

import neusoft.sawyer.learn.aop.security.CurrentUserHolder;
import neusoft.sawyer.learn.aop.service.LogService;
import neusoft.sawyer.learn.aop.service.ProductService;
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
public class CheckTest {

    @Resource
    private ProductService productService;
    @Resource
    private LogService logService;

    @Test
    public void insertTest() {
        CurrentUserHolder.set("admin");
        this.productService.delete(1);
    }

    @Test
    public void logTest() {
        this.logService.log();
    }
}
