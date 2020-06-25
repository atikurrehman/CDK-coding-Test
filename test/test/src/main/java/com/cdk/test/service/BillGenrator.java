package com.cdk.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cdk.test.repository.DiscountslabesRepository;

@Component
public abstract class BillGenrator {
	
	@Autowired
	DiscountslabesRepository repo;
	public abstract double genrateBill(double billAmount);

}
