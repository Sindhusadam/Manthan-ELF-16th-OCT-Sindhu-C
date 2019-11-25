package com.manthan.empwebapp.dao;

import com.manthan.empwebapp.beans.EmployeeInfoBean;

public interface EmployeeDAO {

	public EmployeeInfoBean SearchEmployee (int empId); 
	
	public boolean addEmployee (EmployeeInfoBean employeeInfoBean) ;
	
	public EmployeeInfoBean authenticate(int empId ,String password);

	public boolean deleteEmployee(int empId);
	
	public boolean updateEmployee(int EmpId,String empName);
	
	
}//end of interface
