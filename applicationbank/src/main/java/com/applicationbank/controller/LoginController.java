package com.applicationbank.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.applicationbank.pojo.Bank;
import com.applicationbank.pojo.Branch;
import com.applicationbank.pojo.Customer;
import com.applicationbank.pojo.LoanApplication;
import com.applicationbank.pojo.LoanType;
import com.applicationbank.repository.BankRepository;
import com.applicationbank.service.BankService;
import com.applicationbank.service.BranchService;
import com.applicationbank.service.LoanApplicationService;
import com.applicationbank.service.LoanTypeService;
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
	
	@Autowired
	private LoanTypeService loanTypeService;
	@Autowired
	private LoanApplicationService loanApplicationService;
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
	public String byIdAndPassword (Bank bank, Customer customer,Model model,LoanType loantype, HttpSession session)
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
		model.addAttribute("loanapplication", new LoanApplication() );
		session.setAttribute("sessionCustomer",customer);
			return "loanapplication";	
			
	}
	
	
	
	
	@RequestMapping(value="loadAllBranch/{id}" , method= RequestMethod.GET)
	@ResponseBody
	public String loadState(@PathVariable("id") String ids)
	{
		System.out.println(ids + "id by controller");
		 ids = ids.substring(0, ids.length() - 5);
		 System.out.println(ids + "id by controller");
		 int id  = Integer.parseInt(ids);
		 Bank bank = new Bank(id);
		
		System.out.println(new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setPrettyPrinting().create().toJson(branchService.findByBank( bank)));
		System.out.println("succesfull run branch  list");
		return new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setPrettyPrinting().create().toJson(branchService.findByBank( bank));
		
	
		
		}
	
	
	@RequestMapping(value="loadAllLoanType/{id}" , method= RequestMethod.GET)
	@ResponseBody
	public String loadLoanType (@PathVariable("id") String ids)
	{
		System.out.println(ids + "id by controller **********************************************************************");
		 ids = ids.substring(0, ids.length() - 5);
		 System.out.println(ids + "id by controller ////////////////////////////////////////////////////////////////////");
		 int id  = Integer.parseInt(ids);
		 
		
		Branch branch=new Branch(id);
		
		System.out.println(new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setPrettyPrinting().create().toJson(loanTypeService.findByBranch(branch)));
		System.out.println("succesfull run branch  list");
		return new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setPrettyPrinting().create().toJson(loanTypeService.findByBranch(branch));
		
	
		
		
	}
	
	@RequestMapping(value="test/{id}" , method= RequestMethod.GET)
	@ResponseBody
	public void test(@PathVariable("id") String ids , HttpSession session,LoanType loanType)
	{
		ids = ids.substring(0, ids.length() - 5);
		int id  = Integer.parseInt(ids);
		session.setAttribute("loanType", id);
		System.out.println(id + "id by controller/*/*/*/*/*/*/*/*//*/*/*/*/*/*/*/*//*/*/*/*/**/***/");
		
		
	}
	
	
	
	
	/*@RequestMapping("/viewloanapplication")
	public String loanApplication (Model model)
	{
		model.addAttribute("loanapplication", new LoanApplication() );
		
		return "viewloanapplication";
	}*/
	
	
	@RequestMapping(value="/viewloanapplication" , method = RequestMethod.POST )
	public String viewLoanApplications(LoanApplication loanApplication, Model model, HttpSession session)
	{
		System.out.println(session.getAttribute("sessionCustomer"));
		Customer customer =(Customer)session.getAttribute("sessionCustomer");
		
		System.out.println(session.getAttribute("loanType"));
		int id=(int) session.getAttribute("loanType");
		LoanType loanType=new LoanType(id);
		loanApplication.setCustomer(customer);
		loanApplication.setLoantype(loanType);
		
		
		/*System.out.println(loanApplication.getLoantype());*/
		System.out.println(" inside viewloanapplication");
		System.out.println(loanApplication);
		
		loanApplicationService.save(loanApplication);
		
		return "forward:/loanapplicationsbycustomer";
	}
	
	
	@RequestMapping(value="/loanapplicationsbycustomer")
	public String byCustomerLoanApplication(Model model, HttpSession session,LoanApplication loanApplication)
	{
		Customer customer =(Customer)session.getAttribute("sessionCustomer");
		List<LoanApplication> loanApplications=loanApplicationService.findByCustomer(customer);
		
		
		System.out.println(loanApplications);
		model.addAttribute("loanApplications", loanApplications);
		
		return "viewloanapplication";
	}



		
	/*mysql> select loantypename from loantype where loantypeid in (select loantypeid
			from loanapplication where customerid =  1);*/
	

}
