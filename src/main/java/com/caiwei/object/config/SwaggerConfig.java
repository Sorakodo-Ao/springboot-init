package com.caiwei.object.config;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * knife4j(swagger)配置
 */
@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        // 标题
                        .title("springboot-init")
                        // 描述
                        .description("springboot-init-接口文档")
                        .version("v1") // 版本
                        .contact(new Contact().name("caiwei").email("2818688939@qq.com"))
                        .license(new License().name("Apache 2.0")));
    }
}
