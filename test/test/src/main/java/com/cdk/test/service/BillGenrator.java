package com.cdk.test.service;

import org.springframework.stereotype.Component;

@Component
public interface BillGenrator {
	
	
	public double genrateBill(double billAmount);

}
