package com.demo.dao;

import java.util.List;

import com.demo.model.Customer;

public interface CustDao {

	List<Customer> fetchCust();

	void addCust(Customer c);

	void deleteCust(String cno);

	Customer getByCno(String cno);

	void modifyProduct(Customer customer);

}
