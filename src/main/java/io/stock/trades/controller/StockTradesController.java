package io.stock.trades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockTradesController {

	@GetMapping("/stocks")
	public String getMessage() {
		return "Welcome to stocktrades.io ";
	}
	
}
