package com.cdk.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdk.test.model.DiscountSlabes;
import com.cdk.test.repository.DiscountslabesRepository;

@Service
public class PremimumCustomerBillCalculater implements BillGenrator {
	
	@Autowired
	DiscountslabesRepository repo;

	@Override
	public double genrateBill(double billAmount) {
		double discountedbill = 0.0;
		List<DiscountSlabes> slabes = repo.findAllDiscountSalebsByCustomerTypeANDBill(CustomerType.PREMIMUM,
				billAmount);

		for (DiscountSlabes discountSlabes : slabes) {
			if (billAmount >= discountSlabes.getMaxValue())
				discountedbill += discountSlabes.getDiscount()
						* (discountSlabes.getMaxValue() - discountSlabes.getMinValue()+1)/100;
			else {
				discountedbill += discountSlabes.getDiscount() * (billAmount - discountSlabes.getMinValue())/100;
			}
		}

		return billAmount-discountedbill;
	}

}
