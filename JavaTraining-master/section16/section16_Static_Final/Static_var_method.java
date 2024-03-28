package section16_Static_Final;

class car
{
	static int OFFPrice = 10000;	//Static variable.
	int a,b;	//non static Variable
	
	static double ONNPrice(String Brand) 	//Static Method
	{
		switch(Brand)
		{
		case "BMW" : 
			return OFFPrice + OFFPrice * 2.0;

		case "AUDI":
			return OFFPrice+OFFPrice*3.0;
			}
		return OFFPrice;
		
	
	}
}

public class Static_var_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(car.ONNPrice("BMW"));
		System.out.println(car.OFFPrice);

	}

}
