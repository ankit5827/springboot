package com.database.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.database.demo.pojo.Customer;
import com.database.demo.pojo.Manager;
import com.databse.demo.service.CustomerService;


@Controller
public class DatabaseDemoController {

	private CustomerService customerService;

	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	
	
	@RequestMapping("/customerregister")
	public String register (Model model)
	{
		model.addAttribute("customer", new Customer());
		
		return "customerregister";
	}
	
	@RequestMapping( value="/success", method=RequestMethod.POST)
	
		public String saveCustomer(Model model ,Customer customer)
		{
		System.out.println("in save customer controller"+ customer);
		customer.setManager(new Manager(1l));
		customer.setCustomerid(55l);
		customerService.save(customer);
		return "success";
		}
	
	
	
}
