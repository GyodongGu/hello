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
		Employee emp = dao.getEmployee(empNo);
		return emp;
	}

	@Override
	public void insertEmployee(Employee emp) {
		// TODO Auto-generated method stub
		dao.insertEmpProc(emp);
	}

	@Override
	public void updateEmployee(Employee emp, int empNo) {
		// TODO Auto-generated method stub
		dao.updateEmp(emp, empNo);
		
	}

	@Override
	public void deleteEmployee(int empNo) {
		// TODO Auto-generated method stub
		dao.deleteEmp(empNo);
	}
	
}
