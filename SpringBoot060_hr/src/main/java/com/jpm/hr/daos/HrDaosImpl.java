package com.jpm.hr.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.jpm.hr.entity.Employee;
import com.jpm.hr.exceptions.HrExceptions;

@Repository("HrDaos")
public class HrDaosImpl implements HrDaos{

	private static final long serialVersionUID = -2233232235877330385L;

	@PersistenceContext
	private EntityManager manager;
	
	
	@Override
	public Employee getEmpDetails(int empNo) throws HrExceptions {
		
		//Employee emp = new Employee(1, "aaa", 8000, 10);
		Employee emp = manager.find(Employee.class, empNo);
		return emp;
	}

}
