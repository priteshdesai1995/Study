package section18_Exception_Handling;

class StackOverflow extends Exception
{
	public String toString()
	{
		return "---Stack Over Flow---";
	}
}
class StackUnderflow extends Exception
{
	public String toString()
	{
		return "---Stack Under Flow---";
	}
}

class Stack{

	int top=-1;
	int size;
	int S[];
	
	public Stack(int size)
	{
		this.size=size;
		S=new int[size];
	}
	
	public void push(int x) throws StackOverflow
	{
		if(top==size-1)
			throw new StackOverflow();
		
		top++;
		S[top]=x;
		
	}
	
	public int pop() throws StackUnderflow
	{
		int x=-1;
		if(top==-1)
			throw new StackUnderflow();
		x=S[top];
		top--;
		return x;
	}
}




public class StackEX {
	public static void main(String args[])
	{
		Stack S=new Stack(5);
		try {
			S.push(10);
			S.push(10);
			S.push(10);
			S.push(10);
			S.push(10);
			S.push(10);


		} catch (StackOverflow e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		try {
			S.pop();
		} catch (StackUnderflow e) {	
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
}
