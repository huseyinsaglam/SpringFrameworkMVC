package _01.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class Page1Controller extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		// http://localhost:8080/SpringMVCWeek2/page1
		ModelAndView mv = new ModelAndView("myPage1");
		mv.addObject("mymessage", "Hello Page1Controller");
		return mv;
	}

}
