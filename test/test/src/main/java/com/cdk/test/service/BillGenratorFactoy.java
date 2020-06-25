package com.cdk.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BillGenratorFactoy {
	@Autowired
	private RegularCustomerBillCalculater reRepo;
	@Autowired
	private PremimumCustomerBillCalculater prRepo;

	public BillGenrator getBillGenrator(CustomerType customerType) {
		BillGenrator billGenrator = null;

		switch (customerType) {
		case REGULAR:
			billGenrator = reRepo;
			break;
		case PREMIMUM:
			billGenrator = prRepo;
			break;
		default:
			break;
		}

		return billGenrator;
	}

}
