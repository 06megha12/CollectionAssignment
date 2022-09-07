package com.employee;

import java.util.HashSet;
import java.util.Set;

public class EmployeeDemo {

	public static void main(String[] args) {

		Employee e1 = new Employee(111, "Megha", 1000, "HR", "Pandharpur");
		Employee e2 = new Employee(222, "Neha", 2000, "software", "Indore");
		Employee e3 = new Employee(333, "Vedanti", 2300, "IT4", "Amravati");
		Employee e4 = new Employee(444, "Kajal", 5000, "Admin", "Pune");
		Employee e5 = new Employee(555, "Priya", 4000, "It1", "Nagpur");
		Employee e6 = new Employee(666, "Pallavi", 10000, "It2", "jalgaon");
		Employee e7 = new Employee(777, "Reshama", 17990, "It3", "Mumbai");
	
		Set<Employee> list = new HashSet<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		

		for (Employee e : list) {
			System.out.println(e);
		}
	}
}
