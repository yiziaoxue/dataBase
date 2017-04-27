package com.plateno.booking;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.plateno.booking.config.DynamicDataSourceRegister;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan
@Configuration
@Import({DynamicDataSourceRegister.class})
public class BookingManagerWebApplication {

private static Logger logger = Logger.getLogger(BookingManagerWebApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(BookingManagerWebApplication.class, args);
		logger.info("==========服务启动，开始记录==========");
	}

	@Bean
	public Docket createRestApi() {
	    return new Docket(DocumentationType.SWAGGER_2)
	            .apiInfo(apiInfo())
	            .select()
	            .apis(RequestHandlerSelectors.basePackage("com.plateno.booking.controller"))
	            .paths(PathSelectors.any())
	            .build();
	  }

	private ApiInfo apiInfo() {
	    return new ApiInfoBuilder()
	            .title("VMAN API")
	            .description("预订服务运维系统")
	            .contact("vman")
	            .version("1.0")
	            .build();
	    }
	
}
