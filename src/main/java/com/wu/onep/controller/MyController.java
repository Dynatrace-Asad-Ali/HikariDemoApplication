package com.wu.onep.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wu.onep.model.Employee;
import com.wu.onep.service.MyService;

@RestController
public class MyController {

	private static final Logger logger = LoggerFactory.getLogger(MyController.class);
	
	
	@Autowired
	private MyService myService;

	@RequestMapping(value = "/getemployee", method = RequestMethod.GET)
	public @ResponseBody List<Employee> getMerchantDetail() throws Exception {
		logger.debug("Enter into getMerchantDetail() method.");
		List<Employee> list = myService.getMerchant();
		logger.debug("Exit from getMerchantDetail() method.");
		return list;
	}
	
	
}
