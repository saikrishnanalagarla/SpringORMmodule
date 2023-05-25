package com.nt.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.entity.Employee;
import com.nt.service.IEmployeeMGMTservice;

public class ORMMODULEtesting {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/configs/applicationContext.xml");
		IEmployeeMGMTservice service=ctx.getBean("empService",IEmployeeMGMTservice.class);
		
		Employee emp=new Employee(1, "saikrishna","clerk");

		try {
			System.out.println(service.registerEmployee(emp));
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			ctx.close();
		}
	}
}
