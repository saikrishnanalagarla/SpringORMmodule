package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.IEmployeeDAO;
import com.nt.entity.Employee;

@Service("empService")
@Transactional(propagation=Propagation.REQUIRED)
public class EmployeeMGMTservice implements IEmployeeMGMTservice{

	@Autowired
	private IEmployeeDAO empDao;
	
	@Override
	public String registerEmployee(Employee emp) {
		int empval=empDao.insert(emp);
		return " Employee registerd with empid "+empval;
	}

}
