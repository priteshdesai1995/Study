package com.student.demo;

import java.util.ArrayList;
import java.util.List;

public class Studentdao {
//return list of student
	public static List<Student> getStudents() {
		List<Student> students = new ArrayList<>();
		students.add(new Student("Swapnil", "Limgude", "swapnil@gmail.com"));
		students.add(new Student("Madhuri", "Limgude", "madh@gmail.com"));
		students.add(new Student("Devendra", "Shinde", "dev@gmail.com"));
		students.add(new Student("Narendra", "Borhade", "naren@gmail.com"));
		return students;
		
	}

}
