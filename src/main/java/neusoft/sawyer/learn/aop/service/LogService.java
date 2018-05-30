package neusoft.sawyer.learn.aop.service;

import org.springframework.stereotype.Service;

/**
 * Created by sawyer on 2018/5/29.
 */
@Service
public class LogService implements Loggable {

    @Override
    public void log() {
        System.out.println("[neusoft.sawyer.learn.aop.service.LogService]Log");
    }
}
