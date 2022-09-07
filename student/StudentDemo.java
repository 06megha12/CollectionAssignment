package com.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentDemo {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<Student>();

		list.add(new Student(101, "Megha", "Class 9th", 205));
		list.add(new Student(102, "Neha", "Class 9th", 275));
		list.add(new Student(103, "Reshama", "Class 9th", 300));
		list.add(new Student(104, "vedanti", "Class 9th", 370));
		list.add(new Student(105, "pooja", "Class 9th", 100));

		for (Student student : list) {

			int avg = student.getTotalmarks() * 100 / 500;
			// System.out.println(avg);

			if (avg < 50) {
				System.out.println("Students below 50% :" + avg);
				System.out.println(student.getSname());
			}
			if (avg < 35) {
				System.out.println("Students below 35% :" + avg);
				System.out.println(student.getSname());
			}
			if (avg > 60) {
				System.out.println("Students above 60% :" + avg);
				System.out.println(student.getSname());
			}
		}

		execute(list);
	}

	private static void execute(List<Student> sl) {
		// TODO Auto-generated method stub

		Collections.sort(sl, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				String sName1 = o1.getSname();
				String sName2 = o2.getSname();

				return sName2.compareTo(sName1);
			}
		});
		System.out.println(sl);
	}
}
