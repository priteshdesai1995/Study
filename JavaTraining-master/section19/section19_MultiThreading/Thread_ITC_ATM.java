package section19_MultiThreading;

class Atm {
	synchronized void checkBalance(int bal, String name) {
		System.out.println(name + " Checking..");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		;
		System.out.println("balance " + bal);
	}

	synchronized void withDraw(String name, int amt) {
		System.out.println(name + " Withdrawing..");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
		}
		;
		System.out.println("Amount " + amt);
	}
}

class Customer extends Thread {
	String name;
	int amt;
	Atm atm;
	public Customer(String name, Atm atm , int amt) {
		// TODO Auto-generated constructor stub
	this.name=name;
	this.atm=atm;
	this.amt=amt;
	}
	public void useAtm()
	{
		atm.checkBalance(1000,name);
		atm.withDraw(name, 1000);
	}
	public void run()
	{
		useAtm();
	}

}

public class Thread_ITC_ATM {

	public static void main(String[] args) {
		// TODO uto-generated method stub
		Atm A= new Atm();
		Customer customer1=new Customer("swapnil",A,100);
		Customer customer2=new Customer("Swap",A,100);
		customer1.start();
		customer2.start();
	}

}
