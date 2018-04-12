package com.applicationbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.applicationbank.pojo.Customer;
import com.applicationbank.pojo.Manager;
import com.applicationbank.service.LoginServiceManager;
@Controller
public class LoginControllerManager {
	
	@Autowired
	LoginServiceManager loginServiceManager;
	
	

	public LoginControllerManager() {
		
	}
	
	@RequestMapping("/loginmanager")
	public String managerLogin (Model model)
	{
		model.addAttribute("manager", new Manager() );
		
		return "loginmanager";
	}
	
	@RequestMapping(value="/afterloginmanager",  method = RequestMethod.POST)
	public String byManagerIdAndPassword(Manager manager, Model model)
	{
		List<Manager> managers= loginServiceManager.findByManageridAndPassword(manager.getManagerid(),manager.getPassword());
		System.out.println(managers);
		if(managers.isEmpty())
		{
			return "redirect:/loginmanager";
		}
		
		return"success";
	}
	
	
	
	
	
	
	
	

}
