package com.demo.service;

import java.util.List;

import com.demo.model.Customer;

public interface CustService {

	List<Customer> getCustomers();

	void addnewCustomer(Customer c);

	void deleteByCno(String cno);

	Customer getByCno(String cno);

	void updateByCno(Customer customer);

}
