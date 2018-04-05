package com.applicationbank.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.applicationbank.pojo.Bank;
import com.applicationbank.pojo.Customer;
import com.applicationbank.pojo.LoanApplication;
import com.applicationbank.repository.BankRepository;
import com.applicationbank.service.CustomerService;

@Controller
public class LoanApplicationController {
	
	
	/*@RequestMapping("/loanapplication")
	public String customerLogin (Model model)
	{
		model.addAttribute("loanapplication", new LoanApplication() );
		
		return "loanapplication";
	}*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*@Autowired
	CustomerService customerService;
	BankRepository bankRepository;

	public LoanApplicationController() {
		
	}
	
	@RequestMapping(value = "/login" , method = RequestMethod.POST)
	public String processLogin( Model model , Customer customer){
		System.out.println("***************************************************************");
		System.out.println("inside login post");
		System.out.println(customer);
		if(customer != null) {
			Customer customer2 = new Customer();
			customer2 = customerService.CheckLogin(customer);
			if(customer2 != null)
			{
				List<Bank> banks = new ArrayList<>();
				banks = (List<Bank>) bankRepository.findAll();
				model.addAttribute("listAllBank",banks);
				model.addAttribute("customer", customer2);
				return "customer/success";
			}
		}
		model.addAttribute("error", "Invalid Credentials");
		return "customer/login";
		
	}
	
	
	@RequestMapping(value="loadAllBranch/{id}" , method= RequestMethod.GET)
	@ResponseBody
	public String loadState(@PathVariable("id") Long id)
	{
		System.out.println(id + "id by controller");
		System.out.println(new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setPrettyPrinting().create().toJson(branchDao.branchByBankId(id)));
		return new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setPrettyPrinting().create().toJson(branchDao.branchByBankId(id));
		
	}
	
	
	
	
	
	
	*/
	

}
