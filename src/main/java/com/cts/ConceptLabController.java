package com.cts;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConceptLabController {

	@RequestMapping("/requirement")
	public ModelAndView requirement(){	
		System.out.println(String.format("The value of my integer is %d", "Hello World"));  // Noncompliant; an 'int' is expected rather than a String)
		return new ModelAndView("requirementPage"); 
	}	
	
	@RequestMapping("/designAndCode")
	public ModelAndView designAndCodePage()
	{	
		return new ModelAndView("designAndCodePage"); 
	}
	
	@RequestMapping("/testing")
	public ModelAndView testing(){
		int param = 1;
		if (param == 1)
		 System.out.println("foo");
		else if (param == 2)
		 System.out.println("foo");
		else if (param == 1) 
		{// Noncompliant
		  System.out.println("foo");
		}
		return new ModelAndView("testingPage");
	}
	
	@RequestMapping("/endToEnd")
	public ModelAndView endToEnd(){
		System.out.println(String.format("The value of my integer is %d", "Hello World"));  // Noncompliant; an 'int' is expected rather than a String)
		return new ModelAndView("endtoEndPage");
	}
	
	@RequestMapping("/projectManagement")
	public ModelAndView projectManagement(){	
		
		return new ModelAndView("projectManagementPage");
	}
	
}
