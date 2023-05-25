package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.nt.entity.Employee;
@Repository("empDao")
public class EmployeeDAO implements IEmployeeDAO{
	@Autowired
	private HibernateTemplate temlate;
	
	@Override
	public int insert(Employee emp) {
	
		temlate.setCheckWriteOperations(false);
		int idval=(int)temlate.save(emp);
		return idval;
	}

}
