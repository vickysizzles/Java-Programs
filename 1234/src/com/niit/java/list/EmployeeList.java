package com.niit.java.list;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {
    public void displayEmployee(List<Employee>emplist){
    	for (Employee emp:emplist) {
    		System.out.println(emp.getId());
    		System.out.println(emp.getName());
    		System.out.println(emp.getSalary());
    	}
    }
	public List<Employee> createEmployeeList() {
	      List<Employee> EmployeeList = new ArrayList<Employee>();
	      Employee emp;
	      emp = new Employee (101,"vicky sizzles", 15462398);
	      EmployeeList.add(emp);
	      emp = new Employee (105,"sertiquw", 5898);
	      EmployeeList.add(emp);
	      emp = new Employee (109,"Laerti", 78956);
	      EmployeeList.add(emp);
	      emp = new Employee (107,"davids", 745814);
	      EmployeeList.add(emp);
	      emp = new Employee (104,"uteis1", 187459);
	      EmployeeList.add(emp);
	    return EmployeeList;
}
	 public boolean exist(List<Employee> empList,int id)
	 {for(Employee emp:empList)
	 {   
		 if(emp.getId()==id)
		 {
			 return true;
	
		 }
	 }
	 return false;
	 }
	 public static void main(String[] args) {
		EmployeeList List=new EmployeeList();
		List<Employee> EmployeeList=List.createEmployeeList();
		List.displayEmployee(EmployeeList);
		System.out.println(List.exist(EmployeeList, 107));
	}
}

