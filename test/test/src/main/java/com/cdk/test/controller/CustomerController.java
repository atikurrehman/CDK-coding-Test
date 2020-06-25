package com.cdk.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdk.test.service.CustomerService;

@RestController
@RequestMapping("customers/")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;

	@GetMapping("bill/{customerId}/{billAmount}")
	public double genrateCustomerBill(@PathVariable("customerId") int customerId,
			@PathVariable("billAmount") double billAmount) {

		return customerService.calculateBill(customerId, billAmount);
	}

}
