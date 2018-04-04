package com.applicationbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.applicationbank.pojo.Customer;
import com.applicationbank.service.LoginService;
@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/login")
	public String customerLogin (Model model)
	{
		model.addAttribute("customer", new Customer() );
		
		return "login";
	}
	
	@RequestMapping(value="/customerhome" , method = RequestMethod.POST )
	public String byIdAndPassword (Customer customer,Model model)
	{
		System.out.println(customer);
		List<Customer> customers= loginService.findByCustomeridAndPassword(customer.getCustomerid() ,customer.getPassword());
		System.out.println(customers);
		if(customers.isEmpty())
		{
			return "redirect:/login";
		}
		
			return "customerhome";	
	}



		
		
	

}
