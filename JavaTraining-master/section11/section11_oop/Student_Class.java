package section11_oop;

class Student {
	public int roll_No;
	public String name, course;
	public int m1, m2, m3;

	public int total() {
		return m1 + m2 + m3;

	}

	public double average() {
		return (double) total() / 3;
	}

	public char grades() {
		if (average() >= 80) {
			return 'A';
		}

		else if (average() >= 70) {
			return 'B';
		}

		else if (average() >= 60) {
			return 'C';
		}
		return 'F';
	}

	@Override
	public String toString() {
		return "Student [roll_No=" + roll_No + ", name=" + name + ", course=" + course + ", m1=" + m1 + ", m2=" + m2
				+ ", m3=" + m3 + ", Total=" + total() + ", Average=" + average() + ", Grades=" + grades() + "]";
	}

}

public class Student_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.m1 = 70;
		student.m2 = 80;
		student.m3 = 90;
		student.roll_No = 1;
		student.name = "Swapnil";
		student.course = "Maths";
		// student.studDetails();
		System.out.println("" + student);
		// System.out.println("Total: "+student.total());

		// System.out.println("Average: "+student.average());

		// System.out.println("Grades: "+student.grades());

	}

}
