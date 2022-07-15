package com.ht.emos.config;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.context.annotation.Configuration;
/**
 * @ClassName SpringDocConfig
 * @Description TODO: SpringDoc配置类
 * @Author Wuc
 * @Date 2022/7/14 23:05
 */
@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "emos-api",
                description = "Emos管理系统后端Java项目",
                version = "1.0"
        )
)
@SecurityScheme(
        name = "token",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        scheme = "bearer"
)
public class SpringDocConfig {

}
