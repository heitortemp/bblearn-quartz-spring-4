package com.heitortemp.quartzspring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component("myBean")
public class QuartzController{
	
	private static final Logger logger = LoggerFactory.getLogger(QuartzController.class);
	
	public void log() {
		
		logger.info("Quartz message for you :)");	
	}
}