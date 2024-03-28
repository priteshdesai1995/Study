package section13_AbstractClass;
import java.util.*;

abstract class Hospital
{
	abstract void admission();
	abstract void appointment();
	abstract void emergency();
	abstract void billing();
}

class MyHospital extends Hospital
{
	Scanner sc=new Scanner(System.in);
	String name,add,date;
	int phno,bill;

	@Override
	void admission() {
		// TODO Auto-generated method stub
	System.out.println("Enter Name: ");
	name = sc.next();
	System.out.println("Enter Address: ");
	add= sc.next();
	System.out.println("Enter Phone_No: ");
	phno= sc.nextInt();
	//System.out.println("Name: "+name+", Address: "+add+", Phone no: "+phno);	

		
	}

	@Override
	void appointment() {
		// TODO Auto-generated method stub
		System.out.println("Date of appointment: ");
		date=sc.next();

	}

	@Override
	void emergency() {
		// TODO Auto-generated method stub
		System.out.println("Emergency call 103");	

	}

	@Override
	void billing() {
		// TODO Auto-generated method stub
		System.out.println("Name: "+name+", Address: "+add+", Phone no: "+phno+", Date of appointment: "+date+  "\n your bill: "+bill);	

	}
	
	
	
}


public class HospitalEX_Abstract {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hospital hospital = new MyHospital();
		hospital.admission();
		hospital.appointment();
		hospital.billing();
		hospital.emergency();
		
	}

}
