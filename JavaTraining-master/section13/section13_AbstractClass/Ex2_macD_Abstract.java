  package section13_AbstractClass;
 
  abstract class MacD
  {
	  MacD()
	  {
		  System.out.println("This is Official Store");
	  }
	  void myItem()
	  {
		  System.out.println("1. Mac Maharaja \n 2.Zinger Burger");
	  }
	  abstract void billing();
	  abstract void offer();
  }
  
  class myMacD extends MacD
  {
	  public myMacD() {
		// TODO Auto-generated constructor stub
		  System.out.println("This is the Franchise");
	}

	@Override
	void billing() {
		// TODO Auto-generated method stub
		System.out.println("Billing");
		
	}

	@Override
	void offer() {
		// TODO Auto-generated method stub
		System.out.println("offer");
		
	}
	
	void franchiseOffer()
	{
		System.out.println("Offerrr	");
	}
	  
  }

public class Ex2_macD_Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MacD md = new myMacD();
		md.billing();
		//md.myItem();
		md.offer();
		
		//how to call franchise method...

	}

}
