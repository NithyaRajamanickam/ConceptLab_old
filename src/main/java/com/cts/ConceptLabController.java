package com.cts;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConceptLabController {

	@RequestMapping("/requirement")
	public ModelAndView requirement(){	
		int b = a > 12 ? 4 : 4;
		return new ModelAndView("requirementPage"); 
	}	
	
	@RequestMapping("/designAndCode")	
		return new ModelAndView("designAndCodePage"); 
	}
	
	@RequestMapping("/testing")
	public ModelAndView testing(){	
		int target = -5;
int num = 3;

target =- num;  // Noncompliant; target = -3. Is that really what's meant?
target =+ num; // Noncompliant; target = 3
		return new ModelAndView("testingPage");
	}
	
	@RequestMapping("/endToEnd")
	public ModelAndView endToEnd(){	
		double d = 1.1;
		BigDecimal bd1 = new BigDecimal(d); 
		return new ModelAndView("endtoEndPage");
	}
	
	@RequestMapping("/projectManagement")
	public ModelAndView projectManagement(){		
		return new ModelAndView("projectManagementPage");
	}
	
}
