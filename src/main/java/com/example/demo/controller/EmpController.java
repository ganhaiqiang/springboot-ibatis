package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dao.EmpDao;
import com.example.demo.model.EmpExample;

@Controller
public class EmpController {

	@Autowired
	private EmpDao empDao;

	@GetMapping("sayHello")
	@ResponseBody
	public Object sayHello(String name) {
		return empDao.selectByExample(new EmpExample());
	}
}
