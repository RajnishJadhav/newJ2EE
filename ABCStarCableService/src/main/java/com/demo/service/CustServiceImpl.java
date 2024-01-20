package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.dao.CustDao;
import com.demo.model.Customer;

@Service
public class CustServiceImpl implements CustService{
	
	@Autowired
	private CustDao cdao;

	public List<Customer> getCustomers() {
		return cdao.fetchCust();
	}

	@Override
	public void addnewCustomer(Customer c) {
		cdao.addCust(c);
	}

	@Override
	public void deleteByCno(String cno) {
		cdao.deleteCust(cno);
	}

	@Override
	public Customer getByCno(String cno) {
		return cdao.getByCno(cno);
	}

	@Override
	public void updateByCno(Customer customer) {
		cdao.modifyProduct(customer);
	}

}
