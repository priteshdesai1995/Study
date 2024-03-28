package section18_Exception_Handling;
import java.util.*;
import java.io.*;

public class Try_resources_fileio {
	static FileInputStream fis;
	
	static void divide() throws FileNotFoundException,IOException
	{
		fis= new FileInputStream("/home/files/demo.txt");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println(""+a/b);
		fis.close();
	}
	
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		divide();
	}

}
