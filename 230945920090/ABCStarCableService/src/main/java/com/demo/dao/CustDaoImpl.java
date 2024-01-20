package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.Customer;

@Repository
public class CustDaoImpl implements CustDao{
	
	@Autowired
	private JdbcTemplate jd;

	public List<Customer> fetchCust() {
		return jd.query("select * from customers", (rs, num) -> {
			Customer c = new Customer();
			c.setCno(rs.getString(1));
			c.setBasepack(rs.getString(2));
			c.setOptpack(rs.getString(3));
			return c;
		});
	}

	@Override
	public void addCust(Customer c) {
		jd.update("insert into customers values(?, ?, ?)", new Object[] {c.getCno(), c.getBasepack(), c.getOptpack()});
	}

	@Override
	public void deleteCust(String cno) {
		jd.update("delete from customers where cno = ?", new Object[] {cno});
	}

	@Override
	public Customer getByCno(String cno) {
		return jd.queryForObject("select * from customers where cno = ?", new Object[] {cno}, BeanPropertyRowMapper.newInstance(Customer.class));
	}

	@Override
	public void modifyProduct(Customer customer) {
		jd.update("update customers set values basepack = ?, optpack = ? where cno = ?", new Object[] {customer.getBasepack(), customer.getOptpack(), customer.getCno()});
		
	}

}
