package com.cdk.test.service;

import org.springframework.stereotype.Component;

import com.cdk.test.repository.DiscountslabesRepository;

@Component
public interface BillGenrator {
	
	
	public double genrateBill(double billAmount,DiscountslabesRepository repo);

}
