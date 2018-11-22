package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/persons")
public class PersonController {

	@RequestMapping("/person.detail")
	public ModelAndView personDetail(ModelAndView mv)
	{
	
		 // http://localhost:8080/SpringMVCWeek2JavaBased/persons/person.detail
		mv.setViewName("personPage");
		mv.addObject("message", "peersoncontroller # personDetail  ");
		return mv;
	}
}
