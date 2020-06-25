package com.cdk.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BillGenratorFactoy {

	private static RegularCustomerBillCalculater reRepo;

	private static PremimumCustomerBillCalculater prRepo;

	public static BillGenrator getBillGenrator(CustomerType customerType) {
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

	@Autowired
	public void setReRepo(RegularCustomerBillCalculater reRepo) {
		BillGenratorFactoy.reRepo = reRepo;
	}

	@Autowired
	public void setPrRepo(PremimumCustomerBillCalculater prRepo) {
		BillGenratorFactoy.prRepo = prRepo;
	}

}
