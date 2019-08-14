

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
