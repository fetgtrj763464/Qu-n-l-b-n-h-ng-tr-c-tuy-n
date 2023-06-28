package com.nonlee.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value="HomeControllerOfAdmin")
public class HomeController {
	@RequestMapping(value = "/quan-tri/trang-chu", method = RequestMethod.GET)//requestMapping nơi nhận những url
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("admin/home");
		return mav;
	}
	
}
