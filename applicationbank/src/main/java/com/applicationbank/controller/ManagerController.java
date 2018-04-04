package com.applicationbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.applicationbank.pojo.Manager;
import com.applicationbank.service.ManagerService;

@Controller
public class ManagerController {

	
		@Autowired
		private ManagerService managerService;
		
		@RequestMapping("/managerregister")
		public String managerRegister (Model model)
		{
			model.addAttribute("manager", new Manager());
			
			return "managerregister";
		}
		
		@RequestMapping( value="/managersuccess", method=RequestMethod.POST)
		
		public String saveManager(Model model ,Manager manager)
		{
		System.out.println("in save manager controller"+ manager);
		
		
		managerService.save(manager);
		return "managersuccess";
		}

		public ManagerController() {
			
		}
	

}
