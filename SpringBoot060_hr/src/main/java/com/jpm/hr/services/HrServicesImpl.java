package com.jpm.hr.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.jpm.hr.daos.HrDaos;
import com.jpm.hr.entity.Employee;
import com.jpm.hr.exceptions.HrExceptions;

@Service("HrService")
public class HrServicesImpl implements HrServices{
	
	private static final long serialVersionUID = 8624016349515231835L;
	
	@Autowired(required=true)
	@Qualifier("HrDaos")
	private HrDaos daos;

	@Override
	public Employee getEmpDetails(int empNo) throws HrExceptions {
		
		return daos.getEmpDetails(empNo);
	}

}
