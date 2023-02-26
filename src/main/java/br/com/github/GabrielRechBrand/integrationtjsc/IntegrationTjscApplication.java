package br.com.github.GabrielRechBrand.integrationtjsc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

@EnableCaching
@EnableSpringDataWebSupport
@SpringBootApplication
public class IntegrationTjscApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegrationTjscApplication.class, args);
	}

}
