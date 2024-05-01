package com.smbc.epix.transaction.services.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * The configuration for Swagger.
 * <p>
 * <p>
 * The purpose of Swagger: 1. Auto generate document for exposed services. 2. Provide user interface
 * to test exposed services.
 * <p>
 * How to access Swagger UI: 1. Deploy this application to server (e.g. Tomcat). 2. Start
 * application server. 3. access http://<URL>/application/swagger-ui.html e.g.
 * http://localhost:8080/EPIXMaster-0.1.0/swagger-ui.html#
 *
 * @author QS Team
 * @version 0.1.0
 * @date 27 Feb 2018
 */

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any()).build();
    }
}
