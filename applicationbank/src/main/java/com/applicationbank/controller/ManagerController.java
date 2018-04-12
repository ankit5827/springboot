package com.applicationbank.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.applicationbank.pojo.Bank;
import com.applicationbank.pojo.Branch;
import com.applicationbank.pojo.LoanType;
import com.applicationbank.pojo.Manager;
import com.applicationbank.service.BankService;
import com.applicationbank.service.BranchService;
import com.applicationbank.service.ManagerService;
import com.google.gson.GsonBuilder;

@Controller
public class ManagerController {

	
		@Autowired
		private ManagerService managerService;
		@Autowired
		private BankService bankService;
		@Autowired
		private BranchService branchService;
		
		@RequestMapping("/managerregister")
		public String managerRegister (Model model , Bank bank , Manager manager)
		{
			List<Bank> banks = new ArrayList<>();
			banks = (List<Bank>) bankService.findAll(bank);
			System.out.println(banks);
			model.addAttribute("listAllBank",banks);
			model.addAttribute("manager", new Manager());
			managerService.save(manager);
			return "managerregister";
		}
		
		@RequestMapping( value="/managerloanapplications", method=RequestMethod.POST)
		
		public String saveManager(Model model ,Manager manager, HttpSession session ,HttpServletRequest request )
		{
			
			
		System.out.println(request.getParameter("loanchbranchid"));
		System.out.println("in save manager controller"+ manager);
		
		String idd = request.getParameter("loanchbranchid");
		
		int id = Integer.parseInt(idd);
		
		Branch branch=new Branch(id);
		
		manager.setBranch(branch);
		System.out.println("after manager login");
		model.addAttribute("manager",new Manager());
		managerService.save(manager);
		return "managersuccess";
		}
		
		public ManagerController() {
			
		}
	

}
