package xyz.lilei123.swagger;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @ClassName SwaggerConfig
 * @Description TODO
 * @Author lilei
 * @Date 25/03/2019 11:26
 * @Version 1.0
 **/
@Configuration
@ComponentScan(basePackages = "xyz.lilei123.swagger")
@EnableSwagger2
public class SwaggerConfig {
    public Docket controllerApi() {
//        return new Docket(DocumentationType.SWAGGER_2).groupName("manager").apiInfo().select().apis()
        return null;
    }
}
