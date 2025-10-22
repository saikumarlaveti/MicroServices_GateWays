package com.example.demo.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/ShoppingMS")
public class ShoppingOperations {
	@Autowired
	public RestTemplate template;
	Logger logger = LoggerFactory.getLogger(ShoppingOperations.class);
	
	
	@GetMapping("/Shopping")
	public String doShopping() {
		logger.info("Shopping Operations just Started");
		//invoke another ms billing
		String msg = template.getForObject("http://localhost:9092/BillingMS/billing",String.class);
		logger.info("Billing Service invoked");
		logger.info("Back to Shopping Service");
		
		return "Shopping Service :" + msg;
		//return "Shopping Service :";
		
	}
}
