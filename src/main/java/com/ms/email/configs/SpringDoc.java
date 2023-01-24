package com.ms.email.configs;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDoc{
	
	// http://localhost:8080/swagger-ui/index.html
		@Bean
		public GroupedOpenApi swagger() {
			return GroupedOpenApi.builder()
					.group("com.ms.email")
					.packagesToScan("com.ms.email.controllers")
					.build();
		}


}
