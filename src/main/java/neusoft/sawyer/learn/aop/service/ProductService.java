package neusoft.sawyer.learn.aop.service;

import neusoft.sawyer.learn.aop.domain.Product;
import neusoft.sawyer.learn.aop.annotation.AdminOnlyAnnotation;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by sawyer on 2018/5/29.
 */
@Component
public class ProductService implements Loggable {

    @Resource
    private AuthService authService;

    @Override
    public void log() {

    }

    @AdminOnlyAnnotation
    public void insert(Product product) {
        System.out.println(String.format("[neusoft.sawyer.learn.aop.service.ProductService.insert]Delete product: %s", product));
    }

    @AdminOnlyAnnotation
    public void delete(int id) {
        System.out.println(String.format("[neusoft.sawyer.learn.aop.service.ProductService.delete]Delete product: %s", id));
    }
}
