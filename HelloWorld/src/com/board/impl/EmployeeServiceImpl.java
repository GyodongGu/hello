package com.board.impl;

import java.util.List;

import com.board.model.Employee;
import com.board.model.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{
	EmpDAO dao = new EmpDAO();
	
	@Override
	public List<Employee> getEmpList() {
		// TODO Auto-generated method stub
		List<Employee> list = dao.getEmplist();
		
		return list;
	}

	@Override
	public Employee getEmployee(int empNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertEmployee(Employee emp) {
		// TODO Auto-generated method stub
		dao.insertEmp(emp);
	}

	@Override
	public void updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(int empNo) {
		// TODO Auto-generated method stub
		
	}
	
}
