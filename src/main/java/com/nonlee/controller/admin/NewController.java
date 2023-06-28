package com.nonlee.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value="NewControllerOfAdmin")
public class NewController {
  @RequestMapping(value="/quan-tri/bai-viet/danh-sach", method = RequestMethod.GET)
  public ModelAndView showlist() {
		ModelAndView mav = new ModelAndView("admin/new/list");
		return mav;
	}
  
  @RequestMapping(value="/quan-tri/bai-viet/chinh-sua", method = RequestMethod.GET)
  public ModelAndView showedit() {
		ModelAndView mav = new ModelAndView("admin/new/edit");
		return mav;
	}
} 
