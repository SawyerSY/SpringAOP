package neusoft.sawyer.learn.aop.service;

import org.springframework.stereotype.Component;

/**
 * Created by sawyer on 2018/5/29.
 */
@Component

public class ExecutionService {

    public void test1(String s) throws IllegalAccessException {
        System.out.println("neusoft.sawyer.learn.aop.service.ExecutionService.test1");
        test2();
        throwsTest();
    }

    private void test2() {
        System.out.println("neusoft.sawyer.learn.aop.service.ExecutionService.test1");
    }

    public void throwsTest() throws IllegalAccessException {
        throw new IllegalAccessException("throwsTest");
    }
}
