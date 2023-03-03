package com.auth.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.auth.controller.JwtAuthenticationController;

@Service
public class LoggerUtility {
	private static final Logger logger = LoggerFactory.getLogger(JwtAuthenticationController.class);
	
	public void log(String message)
	{
		logger.info(message);
	}
	
	public void log(String message, String type)
	{
		logger.info(message, type);
	}
}
