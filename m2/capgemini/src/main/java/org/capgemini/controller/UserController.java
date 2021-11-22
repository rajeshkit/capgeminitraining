package org.capgemini.controller;

import org.springframework.stereotype.Controller;
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
		ModelAndView mav = new ModelAndView();
		mav.setViewName("signup");// /WEB-INF/services.jsp
		return mav;
	}
	@RequestMapping("/submitsignup")
	public ModelAndView submitSignupPage(@RequestParam("username") String uname,
			@RequestParam("userpassword") String upass,
			@RequestParam("usergender") String ugender,
			@RequestParam("useremail") String uemail,
			@RequestParam("userphone") long uphone,
			@RequestParam("useraddress") String uaddress,
			@RequestParam("usercity") String ucity) {
		System.out.println("submit sign up invoked: "+uname+" "+upass);
		ModelAndView mav = new ModelAndView();
		mav.addObject("un", uname);
		mav.addObject("up", upass);
		mav.addObject("ug", ugender);
		mav.addObject("ue", uemail);
		mav.addObject("uph", uphone);
		mav.addObject("ua", uaddress);
		mav.addObject("uc", ucity);
		
		mav.setViewName("result");// /WEB-INF/result.jsp
		return mav;
	}
}
