package com.nt.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "EMPLOYEE_TAB")
public class Employee {
	
	@Column(name = "ENO")
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empno;
	
	@Column(name = "ENAME",length = 20)
	private String ename;
	
	@Column(name = "JOB",length = 20)
	private String desg;

	
	public Employee(Integer empno, String ename, String desg) {
		System.out.println("Employee 3-param constructor");
		this.empno = empno;
		this.ename = ename;
		this.desg = desg;
	}


	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return ename;
	}
	public void setEmpname(String empname) {
		this.ename = empname;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}

}
