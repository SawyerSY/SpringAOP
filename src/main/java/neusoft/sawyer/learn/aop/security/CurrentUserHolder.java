package neusoft.sawyer.learn.aop.security;

import java.util.Objects;

/**
 * Created by sawyer on 2018/5/29.
 */
public class CurrentUserHolder {

    private static final ThreadLocal<String> HOLDER = new ThreadLocal<>();

    public static String get() {
        return Objects.isNull(HOLDER.get()) ? "unknown" : HOLDER.get();
    }

    public static void set(String user) {
        HOLDER.set(user);
    }
}
