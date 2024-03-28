package section16_Static_Final;
import java.util.*;
class Student
{
	private String rollNo;
	private static int count;
	
	private static String genRollNo()
	{
		Date date= new Date();
		String rollno = "univ-"+(date.getYear()+1900)+"-"+count;
		count++;
		return rollno;
	}
	
	public Student()
	{
		rollNo=genRollNo();	
	}
	
	public String getRollNo()
	{
		return rollNo;
	}
}

public class Static_Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		System.out.println(student1.getRollNo());
		System.out.println(student2.getRollNo());
		System.out.println(student3.getRollNo());
	}
	
}
