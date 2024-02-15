package com.collections;

import java.util.Comparator;

public class namecomp implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.getEmpName().compareTo(e2.getEmpName());
	}

}
