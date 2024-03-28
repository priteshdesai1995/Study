package section23_IOStreams;

import java.io.File;
public class Fileclass {
	public static void main(String args[])
	{
		File f = new File("/home/swapnil_limgude/iostreams");
		System.out.println(f.isDirectory());
		
		File list[] =f.listFiles(); 
		
		for(File x : list)
		{
			System.out.println(x.getParent()+""+x.getPath());
		}
		
//		String ar[]=f.list();
//		for(String x: ar)
//		{
//			System.out.println(x);
//		}
	}

}