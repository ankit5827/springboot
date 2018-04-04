package com.applicationbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.applicationbank.pojo.Customer;
import com.applicationbank.pojo.Manager;
import com.applicationbank.service.CustomerService;
import com.applicationbank.service.ManagerService;


@Controller
public class DatabaseDemoController {
	
    @Autowired
	private CustomerService customerService;
    private ManagerService managerService;

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
		
		
		customerService.save(customer);
		return "success";
		}
	
	
	
	
	
	
}
