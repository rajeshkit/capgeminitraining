package org.capgemini.controller;

import java.net.http.HttpRequest;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.capgemini.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("menu", "products,services,aboutus,contactus");
		mav.setViewName("index"); // /WEB-INF/index.jsp
		return mav;
	}
	
	@RequestMapping("/products")
	public ModelAndView product() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("pro", "mobile app, redbus, irctc, incometax");
		mav.setViewName("products"); // /WEB-INF/products.jsp
		return mav;
	}
	@RequestMapping("/services")
	public ModelAndView services() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("ser","telecommunication, mobile app, webapp");
		mav.setViewName("services");// /WEB-INF/services.jsp
		return mav;
	}
	@RequestMapping("/signup")
	public ModelAndView signupPage() {
		User user=new User();
		ModelAndView mav = new ModelAndView();
		mav.addObject("u", user);
		mav.setViewName("signup");
		return mav;
	}
	
	@RequestMapping("/submitsignup")
	public ModelAndView submitSignupPage(@ModelAttribute("u") User us) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("use", us);
		mav.setViewName("result");// /WEB-INF/result.jsp
		return mav;
	}
}
