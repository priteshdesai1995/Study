	package section14_Interfaces;

public class Customer implements Member{

	String name;
	
	public Customer(String name) {
		super();
		this.name = name;
	}

	@Override
	public void callBack() {
		// TODO Auto-generated method stub
		System.out.println("CallBack method visited"+name);
		
	}

}
