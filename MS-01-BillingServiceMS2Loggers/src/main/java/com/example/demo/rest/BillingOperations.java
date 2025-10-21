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
@RequestMapping("/BillingMS")
public class BillingOperations {
	@Autowired
	public RestTemplate template;
	Logger logger = LoggerFactory.getLogger(BillingOperations.class);
	
	
	@GetMapping("/billing")
	public String doShopping() {
		logger.info("Billing Operations just Started");
		//invoke another ms billing
		String msg = template.getForObject("http://localhost:9903/PaymentMS/payment",String.class);
		logger.info("Payment Service invoked");
		logger.info("Back to Billing Service");
		
		return  "Bill Amount 90000 :" + msg;
		//return "Billing Service :";
		
	}
}
