package com.nonlee.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value="HomeControllerOfWeb")
public class HomeController {
	@RequestMapping(value = "/trang-chu", method = RequestMethod.GET)//requestMapping nơi nhận những ul(dsach)
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("web/home");
		return mav;
	}

}
