package neusoft.sawyer.learn.aop.service;

import org.springframework.stereotype.Service;

/**
 * Created by sawyer on 2018/5/29.
 */
@Service

public class ArgsService {

    public void argsLongMethod(Long l) {
        System.out.println(l);
    }

    public void argsLongMethod(Long l, String string, int ...i) {
        System.out.println(l);
    }
}
