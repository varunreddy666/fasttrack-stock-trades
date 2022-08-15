package io.stock.trades.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockTradesController {

	Logger logger = LogManager.getLogger(StockTradesController.class);
	
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
	
	
	
}
