package xyz.lilei123.manager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

/**
 * @ClassName ManagerApp
 * @Description TODO
 * @Author lilei
 * @Date 25/03/2019 11:49
 * @Version 1.0
 **/
@SpringBootApplication
@EntityScan(basePackages = "xyz.lilei123.pojo")
public class ManagerApp {
    public static void main(String[] args) {
        SpringApplication.run(ManagerApp.class);
    }
}
