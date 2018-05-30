package neusoft.sawyer.learn.aop.domain;

import java.io.Serializable;

/**
 * Created by sawyer on 2018/5/29.
 */
public class Product implements Serializable {

    private int id;

    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
