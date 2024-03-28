package section7_8;

import java.util.*;

public class evenodd_young_grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter no to check Even/odd: ");
		int no = sc.nextInt();
		if (no % 2 == 0) {
			System.out.println(no + " EVen no");
		} else {
			System.out.println(no + " Odd no");
		}

		System.out.println("Enter age: ");
		int age = sc.nextInt();
		if (age >= 14 && age <= 55) {
			System.out.println("person is young");
		} else {
			System.out.println("person is Not young");
		}

		float avg = 76f;
		if (avg >= 80) {
			System.out.println('A');
		}
		else if (avg>= 70 && avg<=80)

		{
			System.out.println('B');
		}
		else if (avg>= 50 && avg<=70)

		{
			System.out.println('C');
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
