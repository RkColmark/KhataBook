package com.IRonak.KhataBook.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.IRonak.KhataBook.Entity.MoneyManager;
import com.IRonak.KhataBook.Services.MoneyManagerService;

import java.util.List;
import java.util.Optional;
 
@Controller 
//@RequestMapping("/welcome")
public class MoneyManagerController {

	int totalspent=0;
	
	
	
	@Autowired
	MoneyManagerService moneyManagerService;
	
	
//	@GetMapping("/welcome")
//	public String welcome()
//	{
//		return "index";
//	}
	
	@GetMapping("/")
 	public String AddExpensesPage(Model model)
 	{
 		MoneyManager moneymanager=new MoneyManager();
 		
 		model.addAttribute("moneymanager",moneymanager);
 		
 		return "addexpenses";
 	}

 	@GetMapping("/list")
	public String home(Model theModel) {

 		
 		
		List<MoneyManager> moneyManagers = moneyManagerService.findAll();
		
		theModel.addAttribute("totalspent", totalspent);
		theModel.addAttribute("money", moneyManagers);
 
		return "expenses";
	}
 	
 	
 	@PostMapping("/save")
 	public String saveExpenses(@ModelAttribute("moneymanager") MoneyManager data)
 	{
 		
 		moneyManagerService.saveExpenses(data);
 		
 		totalspent=totalspent+data.getAmount();
 		//System.out.print(totalspent);
 		
 		
 		
 		
 		return "redirect:/list";
 	}
 	
 	
 	
 	@GetMapping("/update")
 	public String updateExpenses(@RequestParam int id , Model model)
 	{
 		MoneyManager moneymanager= moneyManagerService.getMoneyManager(id);
 		
 		
 		
 		model.addAttribute("moneymanager",moneymanager);
 		
 
 		
 		
		return "addexpenses";
 	}

 	@GetMapping("/delete")
 	public String delete(@RequestParam int id)
 	{
 		moneyManagerService.deleteExpenses(id);
 		
 		return "redirect:/list";
 	}
 	
 	@GetMapping("/add")
 	public String addnew(Model model)
 	{
 		MoneyManager moneymanager= new MoneyManager();
 		
 		model.addAttribute("moneymanager", moneymanager);
 		
 		return "addexpenses";
 	}
 	 
}
