package com.wu.onep.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wu.onep.database.EmployeeRepository;
import com.wu.onep.model.Employee;

@Service
public class MyService {

	@Autowired
	public EmployeeRepository employeeRepository;

	private static final Logger logger = LoggerFactory.getLogger(MyService.class);

	public List<Employee> getMerchant() throws InterruptedException  {
		List<Employee> list= (List<Employee>) employeeRepository.findAll();
		logger.info(list.toString());
		return list;
	}
}
