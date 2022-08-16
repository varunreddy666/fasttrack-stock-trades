package io.stock.trades.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class StockTradesController {

	Logger logger = LogManager.getLogger(StockTradesController.class);
	
	private RestTemplate restTemplate;
	
	@Value("${api_key}")
	private String apiKey;
	
	@GetMapping("/")
	public String getDefaultMessage() {
		logger.info("public String getDefaultMessage() method start ");
		return "My Default Message";
	}
	
	@GetMapping("/stocks")
	public String getMessage() {
		logger.info("stocks api is getting called..(getMessage)");
		return "Welcome to stocktrades.io ";
	}
	
//	https://kite.zerodha.com/connect/login?v=3&api_key=xxx

	@GetMapping("/login")
	public String login() {
		logger.info("public String login() begins..");

		String url = "https://kite.zerodha.com/connect/login?v=3&api_key=" + apiKey;
		ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

		if (response.getStatusCode().value() != 200) {
			logger.info("the body of the response to login is:" + response.getBody() + "Http code is:"
					+ response.getStatusCode().value());
		}

		logger.info("public String login() ends..");
		return "";
	}
	
	
}
