package com.jpm.hr.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;


@Entity
@Table(name="EMP_JPA")
public class Employee implements Serializable{

	
	private static final long serialVersionUID = -1489013658227805631L;
	
	private Integer empNo;
	private String empName;
	private Integer empSal;
	private Integer deptNo;
	
	
	
	
	public Employee(Integer empNo, String empName, Integer empSal, Integer deptNo) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.empSal = empSal;
		this.deptNo = deptNo;
	}
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Id
	@Column(name="EMPNO")
	public Integer getEmpNo() {
		return empNo;
	}
	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}
	
	@Column(name="EMPNAME")
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	@Column(name="EMPSAL")
	public Integer getEmpSal() {
		return empSal;
	}
	public void setEmpSal(Integer empSal) {
		this.empSal = empSal;
	}
	
	@Column(name="EMPDEPTNO")
	public Integer getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(Integer deptNo) {
		this.deptNo = deptNo;
	}
	
	
	
}
