package section11_oop;

class StudentHiding {
	public int roll_No;
	public String name, course;
	public int m1, m2, m3;
	
	public int getRoll_No() {
		return roll_No;
	}
	public void setRoll_No(int roll_No) {
		this.roll_No = roll_No;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getM1() {
		return m1;
	}
	public void setM1(int m1) {
		this.m1 = m1;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public int getM3() {
		return m3;
	}
	public void setM3(int m3) {
		this.m3 = m3;
	}
	@Override
	public String toString() {
		return "StudentHiding [roll_No=" + roll_No + ", name=" + name + ", course=" + course + ", m1=" + m1 + ", m2="
				+ m2 + ", m3=" + m3 + "]";
	}
	
	
	
}


public class Student_dataHiding
{
	public static void main(String args[])
	{
		StudentHiding sh=new StudentHiding();
		sh.setRoll_No(1);
		sh.setName("Swap");
		sh.setCourse("Maths");
		sh.setM1(70);
		sh.setM2(80);
		sh.setM3(90);
		System.out.println(sh);
		System.out.println(sh.getCourse());
	}
}