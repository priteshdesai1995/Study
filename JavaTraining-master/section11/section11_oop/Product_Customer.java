package section11_oop;

public class Product_Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product(1, "cococola", 20, 2);
		Customer c1=new Customer(1, "Swapnil", "Bhosari", 830815409);
		System.out.println(p1);
		System.out.println(c1);
		
		//Array Of objects
		Customer c2[]=new Customer[3];
		c2[0]=new Customer(2, "Swapnil", "Bhosari", 830815409);
		c2[1]=new Customer(3, "Swapnil", "Bhosari", 830815409);
		c2[2]=new Customer(4, "Swapnil", "Bhosari", 830815409);
		System.out.println("************"); 
		System.out.println(p1);
		for(Customer c: c2)
		{
		System.out.println(c);
		}

	}

}
