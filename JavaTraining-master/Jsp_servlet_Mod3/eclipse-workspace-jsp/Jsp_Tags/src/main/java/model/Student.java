package model;

public class Student {
	 private String Student_firstName;
	 private String Student_lastName;
	 private boolean boldStudent;
	 
	public Student(String student_firstName, String student_lastName, boolean boldStudent) {
		super();
		this.Student_firstName = student_firstName;
		this.Student_lastName = student_lastName;
		this.boldStudent = boldStudent;
	}

	public String getStudent_firstName() {
		return Student_firstName;
	}

	public void setStudent_firstName(String student_firstName) {
		Student_firstName = student_firstName;
	}

	public String getStudent_lastName() {
		return Student_lastName;
	}

	public void setStudent_lastName(String student_lastName) {
		Student_lastName = student_lastName;
	}

	public boolean isBoldStudent() {
		return boldStudent;
	}

	public void setBoldStudent(boolean boldStudent) {
		this.boldStudent = boldStudent;
	}
	 
}
