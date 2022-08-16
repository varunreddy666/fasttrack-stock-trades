package io.stock.trades.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class StockConfigurations {

	@Bean
	private RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
