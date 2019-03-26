package xyz.lilei123.manager.Repository;

/**
 * @ClassName ProductRepository
 * @Description TODO
 * @Author lilei
 * @Date 14:16
 * @Version 1.0
 **/

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import xyz.lilei123.pojo.Product;

public interface ProductRepository extends CrudRepository<Product, String>, JpaRepository<Product, String>, JpaSpecificationExecutor<Product> {
}
