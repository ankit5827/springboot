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
import com.applicationbank.pojo.LoanApplication;
import com.applicationbank.pojo.LoanType;
import com.applicationbank.pojo.Manager;
import com.applicationbank.service.BankService;
import com.applicationbank.service.BranchService;
import com.applicationbank.service.LoanApplicationService;
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
		
		@Autowired
		LoanApplicationService loanApplicationService;
		
		
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
			String idd = request.getParameter("loanchbranchid");
			Branch branch =  new Branch(Integer.parseInt(idd));
			manager.setBranch(branch);
			model.addAttribute("manager",new Manager());
			managerService.save(manager);
			List<LoanApplication>loanApplications =  loanApplicationService.findByBranchId(branch);
			System.out.println(loanApplications);
			model.addAttribute("loanApplications", loanApplications);
			return "managersuccess";
		}
		
		
		/*@RequestMapping(value="/loanapplicationsbycustomer")*/
		
		
		
		
			
		public ManagerController() {
			
		}
	

}
