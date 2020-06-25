package com.cdk.test.service;

import org.springframework.stereotype.Component;

@Component
public class BillGenratorFactoy {

	public static BillGenrator getBillGenrator(CustomerType customerType) {
		BillGenrator billGenrator = null;
		switch (customerType) {
		case REGULAR:
			billGenrator = new RegularCustomerBillCalculater();
			break;
		case PREMIMUM:
			billGenrator = new PremimumCustomerBillCalculater();
			break;
		default:
			break;
		}

		return billGenrator;
	}

}
