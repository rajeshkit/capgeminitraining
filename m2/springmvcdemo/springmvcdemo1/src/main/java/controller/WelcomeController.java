package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller // its a type of component annotation
public class WelcomeController {
	@RequestMapping("/")
	public ModelAndView welcome() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("index");
		return mav;
	}
	@RequestMapping("/products")
	public ModelAndView products() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("product");
		return mav;
	}
	@RequestMapping("/services")
	public ModelAndView services() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("services");
		return mav;
	}
	@RequestMapping("/aboutus")
	public ModelAndView aboutus() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("aboutus");
		return mav;
	}

}
