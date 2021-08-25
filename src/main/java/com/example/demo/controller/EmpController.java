package com.example.demo.controller;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dao.EmpDao;
import com.example.demo.model.Emp;
import com.example.demo.model.EmpExample;
import com.example.demo.model.EmpExample.Criteria;

@Controller
@Validated
public class EmpController {

	@Autowired
	private EmpDao empDao;

	@GetMapping("sayHello")
	@ResponseBody
	public Object sayHello(Emp emp, BindingResult result) {
		if (result.hasErrors()) {
			return result.getAllErrors();
		}
		EmpExample example = new EmpExample();
		Criteria criteria = example.createCriteria();
		if (emp.getEmpno() != null) {
			criteria.andEmpnoEqualTo(emp.getEmpno());
		}
		if (StringUtils.isNotBlank(emp.getEname())) {
			criteria.andEnameEqualTo(emp.getEname());
		}
		if (emp.getSal() != null) {
			criteria.andSalGreaterThan(emp.getSal());
		}
		return empDao.selectByExample(example);
	}

	@GetMapping("findById")
	@ResponseBody
	public Object findById(@NotNull @Max(value = 1000,message = "id不能大于1000") Short id) {
		return empDao.selectByPrimaryKey(id);
	}
}
