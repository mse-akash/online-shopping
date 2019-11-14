package com.akash.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Controller
@EnableWebMvc
public class PageController {
	
	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView index() {
		
		ModelAndView mv =new ModelAndView("page");
		mv.addObject("greeting","Welcome to online shopping");
		return mv;
		
	}
	@RequestMapping(value= {"/test"})
	public ModelAndView test(@RequestParam (value="greeting", required=false) String greeting) {
		if(greeting==null) {
			greeting ="Hello There!!";
		}
		ModelAndView mv =new ModelAndView("page");
		mv.addObject("greeting",greeting);
		return mv;
		
	}
	
	
	
	@RequestMapping("/test/{greeting}")
	public ModelAndView pathtest(@PathVariable(value="greeting") String greeting) {
	//	String greeting="bc";	
		ModelAndView mv =new ModelAndView("page");
		mv.addObject("greeting",greeting);
		return mv;
		
	}

}
