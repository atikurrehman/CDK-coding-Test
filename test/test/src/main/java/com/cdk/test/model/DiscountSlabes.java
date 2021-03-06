package com.cdk.test.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import com.cdk.test.service.CustomerType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class DiscountSlabes {

	@Id
	int id;
	@Enumerated(EnumType.STRING)
	CustomerType customerType;

	double minValue;
	double maxValue;
	double discount;

}
