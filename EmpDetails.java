package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class EmpDetails {

	public static void main(String[] args) {
	List<Employee> emps = new ArrayList<Employee>();
	emps.add(new Employee(1001, "Kalyani", 100000.56, "Female", 23));
	emps.add(new Employee(1002, "Ratan", 20000.56, "male", 43));
	emps.add(new Employee(1003, "Hari", 70000.56, "male", 41));
	emps.add(new Employee(1003, "Hari", 70000.56, "male", 41));
	for(Employee emp:emps)
	{ if(emp.getEmpName().equals("Ratan"))
	   System.out.println("Employee details"+emp);
		if(emp.getEmpId()==1003)
		{   emp.setEmpSalary(emp.getEmpSalary()+(emp.getEmpSalary()*0.2));
		}
	}
	System.out.println("data"+emps);
	Set<Employee> s = new HashSet<Employee>(emps);
	for (Employee employee : s) {
		System.out.println("removed duplicates"+employee);
	}
	
	Collections.sort(emps, new namecomp());
	for (Employee e :emps) {
		
	
	System.out.println("sorted data"+e);
	}
	
}
}
