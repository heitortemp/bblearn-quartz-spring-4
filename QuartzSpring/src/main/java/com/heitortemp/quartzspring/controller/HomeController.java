package com.heitortemp.quartzspring.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "home", method = RequestMethod.GET)
	public ModelAndView home(Locale locale) {
		
		ModelAndView view = new ModelAndView("home");
		
		logger.debug("Welcome home! The client locale is {}.", locale + " Debug");
		logger.info("Welcome home! The client locale is {}.", locale + " Info");
		logger.warn("Welcome home! The client locale is {}.", locale + " Warning");
		logger.error("Welcome home! The client locale is {}.", locale + " Error");
		
		return view;
	}
	
	@RequestMapping(value = "config", method = RequestMethod.GET)
	public ModelAndView config(Locale locale) {
		
		ModelAndView view = new ModelAndView("config");
		
		logger.debug("Welcome Config! The client locale is {}.", locale + "Debug");
		logger.info("Welcome Config! The client locale is {}.", locale + " Info");
		logger.warn("Welcome Config! The client locale is {}.", locale + "Warning");
		logger.error("Welcome Config! The client locale is {}.", locale + "Error");
		
		return view;
	}
	
	@RequestMapping(value = "result", method = RequestMethod.POST)
	public ModelAndView result(HttpServletRequest request, Locale locale, Model model) {
		
		ModelAndView view = new ModelAndView("result");
		
		logger.debug("Welcome Result! The client locale is {}.", locale + "Debug");
		logger.info("Welcome Result! The client locale is {}.", locale + " Info");
		logger.warn("Welcome Result! The client locale is {}.", locale + "Warning");
		logger.error("Welcome Result! The client locale is {}.", locale + "Error");
		
		view.addObject("showName", request.getParameter("testeName"));
		
		return view;
	}	
}
