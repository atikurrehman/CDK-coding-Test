package com.cdk.test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cdk.test.model.DiscountSlabes;

@Service
public class RegularCustomerBillCalculater extends BillGenrator {
	/*
	 * @Autowired DiscountslabesRepository repo;
	 */

	@Override
	public double genrateBill(double billAmount) {
		double discountedbill = 0.0;
		List<DiscountSlabes> slabes = repo.findAllDiscountSalebsByCustomerTypeANDBill(CustomerType.REGULAR, billAmount);

		for (DiscountSlabes discountSlabes : slabes) {
			if (billAmount >= discountSlabes.getMaxValue())
				discountedbill += (discountSlabes.getMaxValue() - discountSlabes.getMinValue() + 1)
						* discountSlabes.getDiscount() / 100;
			else {
				discountedbill += discountSlabes.getDiscount() * (billAmount - discountSlabes.getMinValue()) / 100;
			}
		}

		return billAmount - discountedbill;
	}

}
