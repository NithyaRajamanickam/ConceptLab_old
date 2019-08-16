package com.cts;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConceptLabController {

	@RequestMapping("/requirement")
	public ModelAndView requirement(){	
		/*int param = 1;
		if (param == 1)
		 System.out.println("foo");
		else if (param == 2)
		 System.out.println("foo");
		else if (param == 1) 
		{// Noncompliant
		  System.out.println("foo");
		}*/
		return new ModelAndView("requirementPage");
	}	
	
	@RequestMapping("/designAndCode")
	public ModelAndView designAndCode(){
		
		return new ModelAndView("designAndCodePage");
	}
	
	@RequestMapping("/testing")
	public ModelAndView testing(){
		/*String firstName = "firstName";   //String overrides equals
		String lastName = "lastName";

		if (firstName == lastName)
		{
			 System.out.println("foo");
		}*/
		return new ModelAndView("testingPage");
	}
	
	@RequestMapping("/endToEnd")
	public ModelAndView endToEnd(){
		return new ModelAndView("endtoEndPage");
	}
	
	@RequestMapping("/projectManagement")
	public ModelAndView projectManagement(){
		return new ModelAndView("projectManagementPage");
	}
	
}
