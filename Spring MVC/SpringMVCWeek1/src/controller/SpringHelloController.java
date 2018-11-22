package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import service.HelloService;

@Controller 
@RequestMapping(value="/hello.controller")

// http://localhost:8080/SpringMVCWeek1/hello.controller/print.message
public class SpringHelloController {
	
	@Autowired
	private HelloService service;
	@RequestMapping("/print.message")
	public String printMessage(ModelMap modelMap)
	{
		
		String createdmessage = service.createMessage();
		modelMap.addAttribute("mymessage", createdmessage);
		return "helloPage";
	}

}
