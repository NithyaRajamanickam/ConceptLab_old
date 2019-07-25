package com.cts;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConceptLabController {

	@RequestMapping("/requirement")
	public ModelAndView requirement(){
		return new ModelAndView("requirementPage"); 
	}	
	
	@RequestMapping("/designAndCode")
	public ModelAndView designAndCode(){			
		return new ModelAndView("designAndCodePage");
	}
	
	@RequestMapping("/testing")
	public ModelAndView testing(){		
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
