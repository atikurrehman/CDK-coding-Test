package com.cdk.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cdk.test.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
