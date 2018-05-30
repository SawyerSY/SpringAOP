package neusoft.sawyer.learn.aop.service;

import neusoft.sawyer.learn.aop.security.CurrentUserHolder;
import org.springframework.stereotype.Component;

import java.util.Objects;

/**
 * Created by sawyer on 2018/5/29.
 */
@Component
public class AuthService {

    public void checkAccess() {
        String user = CurrentUserHolder.get();
        if (!Objects.equals("admin", user)) {
            throw new RuntimeException(String.format("Operator not allow: %s", user));
        } else {
            System.out.println(String.format("[neusoft.sawyer.learn.aop.service.AuthService.checkAccess]Welcome to back: %s", user));
        }
    }
}
