package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.Customer;
import com.demo.service.CustService;

@Controller
@RequestMapping("/cust")
public class CustomerController {
	@Autowired
	private CustService cservice;
	
	@GetMapping("/getcust")
	public ModelAndView getCustomers() {
		List<Customer> clist = cservice.getCustomers();
		if(clist != null) {
			return new ModelAndView("displaycust", "clist", clist);
		}
			return new ModelAndView("sorry","msg","Sorry Cant Show");
	}
	
	@GetMapping("/addcust")
	public String addCustomer() {
		return "addcust";
	}
	
	@PostMapping("/addcustomer")
	public ModelAndView insertProduct(@RequestParam String cno, @RequestParam String basepack,@RequestParam String optpack) {
		Customer c=new Customer(cno,basepack,optpack);
		cservice.addnewCustomer(c);
		return new ModelAndView("redirect:/cust/getcust");
		
	}
	
	
	@GetMapping("delete/{cno}")
	public ModelAndView deleteCustomer(@PathVariable String cno) {
		cservice.deleteByCno(cno);
		return new ModelAndView("redirect:/cust/getcust");
	}
	
	@GetMapping("/edit/{cno}")
	public ModelAndView editProduct(@PathVariable String cno) {
		Customer c=cservice.getByCno(cno);
		return new ModelAndView("editCustomer","c",c);
		
	}
	
	@PostMapping("/updateCustomer")
	public ModelAndView updateCustomer(@RequestParam String cno, @RequestParam String basepack,@RequestParam String optpack) {
		cservice.updateByCno(new Customer(cno,basepack,optpack));
		return new ModelAndView("redirect:/cust/getcust");
	}
	
}
