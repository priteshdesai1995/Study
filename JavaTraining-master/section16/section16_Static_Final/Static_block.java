package section16_Static_Final;

//Static blocks will be executed first then main method.
// in same class

public class Static_block {
	
	static {
		System.out.println("block1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main");

	}
	static {
		System.out.println("block2");
	}

}
