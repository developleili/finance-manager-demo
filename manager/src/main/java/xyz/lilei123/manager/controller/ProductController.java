package xyz.lilei123.manager.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import xyz.lilei123.manager.Service.ProductService;
import xyz.lilei123.pojo.Product;

/**
 * @ClassName ProductController
 * @Description TODO
 * @Author lilei
 * @Date 25/03/2019 14:01
 * @Version 1.0
 **/
@RestController
@RequestMapping("/product")
public class ProductController {
    private static Logger Log = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductService service;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Product addProduct(@RequestBody Product product) {
        Log.info("创建产品,参数[]" + product);
        Product result = service.addProduct(product);
        Log.info("创建产品,结果[]" + result);
        return result;
    }
}
