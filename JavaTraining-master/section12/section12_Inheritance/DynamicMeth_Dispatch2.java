package section12_Inheritance;


class sedanCar
{
	public void turnOn()
	{
		System.out.println("sedanCar is turn on");
	}
	public void gear()
	{
		System.out.println("sedanCar has changed its gear");
	}
	
}

class suvCar extends sedanCar
{
	@Override
	public void turnOn()
	{
		System.out.println("SUVCar is turn on");
	}
	@Override
	public void gear()
	{
		System.out.println("SUVCar has changed its gear");
	}
	public void terran()
	{
		System.out.println("SUVCar has turned on its terran mode");
	}
}
public class DynamicMeth_Dispatch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sedanCar sc = new suvCar();
		sc.turnOn();
		sc.gear(); //object is of suvcar so its method are called
		//sc.terran(); //u can onlly call overided methods by dynamic method dispatch
		
	}

}
