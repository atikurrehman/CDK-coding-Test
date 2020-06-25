package com.cdk.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdk.test.exceptionsHandlers.NoCustomerFoundException;
import com.cdk.test.model.Customer;
import com.cdk.test.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;

	public double calculateBill(int customerId, double billAmount) {

		Customer customer = customerRepository.findById(customerId)
				.orElseThrow(NoCustomerFoundException::new);

		BillGenrator billGenrator = BillGenratorFactoy.getBillGenrator(customer.getCustomerType());

		return billGenrator.genrateBill(billAmount);
	}

}
