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
	
	
	
	
	@GetMapping("/payment")
	public String doPayment() {
	
		
		return  "Payment is Done using Saikumar Laveti PHONEPAY";
		//return "Billing Service :";
		
	}
}
