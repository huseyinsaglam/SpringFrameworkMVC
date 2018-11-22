package _01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/transactions")
public class TransactionController {
	
	@RequestMapping(value="/test1" , method = RequestMethod.GET)
	public String helloController(ModelMap modelMap)
	{
		
		// http://localhost:8080/SpringMVCWeek2.1/transactions/test1
		modelMap.addAttribute("message", "return String!");
		return "myTransactionPage";
	}
	
	@RequestMapping(value="/test2" , method = RequestMethod.GET)
	public ModelAndView helloController()
	{
		// http://localhost:8080/SpringMVCWeek2.1/transactions/test2
		ModelAndView mv = new ModelAndView("myTransactionPage");
		mv.addObject("message", "return ModelAndView!");
		return mv;
	}

}
