package com.applicationbank.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.applicationbank.pojo.Bank;
import com.applicationbank.pojo.Customer;
import com.applicationbank.pojo.LoanApplication;
import com.applicationbank.repository.BankRepository;
import com.applicationbank.service.BankService;
import com.applicationbank.service.BranchService;
import com.applicationbank.service.LoginService;
import com.google.gson.GsonBuilder;
@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
	@Autowired
	private BankService bankService;
	@Autowired
	private BranchService branchService;
	
	
	@RequestMapping("/login")
	public String customerLogin (Model model)
	{
		model.addAttribute("customer", new Customer() );
		
		return "login";
	}
	
	
	@RequestMapping("/loanapplication")
	public String customerAfterLogin (Model model)
	{
		model.addAttribute("loanapplication", new LoanApplication() );
		
		return "loanapplication";
	}
	
	@RequestMapping(value="/loanapplication" , method = RequestMethod.POST )
	public String byIdAndPassword (Bank bank, Customer customer,Model model)
	{
		System.out.println(customer);
		List<Customer> customers= loginService.findByCustomeridAndPassword(customer.getCustomerid() ,customer.getPassword());
		System.out.println(customers);
		if(customers.isEmpty())
		{
			return "redirect:/login";
		}
		
		
		
		List<Bank> banks = new ArrayList<>();
		banks = (List<Bank>) bankService.findAll(bank);
		model.addAttribute("listAllBank",banks);
		model.addAttribute("customer", customers);
		System.out.println("succesfull run bank list");
			return "loanapplication";	
			
	}
	
	
	
	
	@RequestMapping(value="loadAllBranch/{id}" , method= RequestMethod.GET)
	@ResponseBody
	public String loadState(@PathVariable("id") Integer id)
	{
		System.out.println(id + "id by controller");
		Bank bank = new Bank(id);
		
		System.out.println(new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setPrettyPrinting().create().toJson(branchService.findByBank( bank)));
		System.out.println("succesfull run bank list");
		return new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setPrettyPrinting().create().toJson(branchService.findByBank( bank));
		
	}
	
	
	
	
	
	
	
	@RequestMapping("/viewloanapplication")
	public String loanApplication (Model model)
	{
		model.addAttribute("loanapplication", new LoanApplication() );
		
		return "viewloanapplication";
	}
	
	
	@RequestMapping(value="/viewloanapplication" , method = RequestMethod.POST )
	public String viewLoanApplications(LoanApplication loanApplication, Model model)
	{
		return "";
	}



		
		
	

}
