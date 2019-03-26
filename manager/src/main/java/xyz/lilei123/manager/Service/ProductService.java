package xyz.lilei123.manager.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.lilei123.manager.Repository.ProductRepository;
import xyz.lilei123.pojo.Product;

/**
 * @ClassName ProductService
 * @Description TODO
 * @Author lilei
 * @Date 14:12
 * @Version 1.0
 **/
@Service
public class ProductService {
    private Logger Log = LoggerFactory.getLogger(ProductService.class);

    @Autowired
    private ProductRepository repository;

    public Product addProduct(Product product) {
        Log.info("添加数据:" + product);
        checkProduct(product);
        setDefault(product);
        Product result = repository.save(product);
        Log.info("添加数据结果:" + result);
        return result;
    }

    private void setDefault(Product product) {
    }


    private void checkProduct(Product product) {
    }


}
