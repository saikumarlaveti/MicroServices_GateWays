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
@RequestMapping("/PaymentMS")
public class PaymentOperations {
	
	Logger logger = LoggerFactory.getLogger(PaymentOperations.class);
	
	
	@GetMapping("/payment")
	public String doPayment() {
		logger.info("Payment Operations just Started");
		
		logger.info("You are in Payment Method Block");
		logger.info("Back to Billing Service");
		
		return  "Payment is Done";
		//return "Billing Service :";
		
	}
}
