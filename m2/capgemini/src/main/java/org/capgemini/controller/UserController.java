package org.capgemini.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	@RequestMapping("/products")
	public ModelAndView product() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("products"); // /WEB-INF/products.jsp
		return mav;
	}
	@RequestMapping("/services")
	public ModelAndView services() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("services");// /WEB-INF/services.jsp
		return mav;
	}

}
