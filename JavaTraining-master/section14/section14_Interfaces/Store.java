package section14_Interfaces;

public class Store {

	int count=0;
	Member	mem []=new Member[100];
	void register(Member m)
	{
		mem[count++]=m;
	}
	void invite()
	{
		for(int i=0;i<count;i++)
		{
			mem[i].callBack();
		}
	}
	public static void main(String args[])
	{
		Store st = new Store();
		Customer c1=new Customer("swapnil");
		Customer c2=new Customer("madh");
		st.register(c1);
		st.register(c2);
		st.invite();
		
	}

}
