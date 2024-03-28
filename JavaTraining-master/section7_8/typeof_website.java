package section7_8;

public class typeof_website {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="http://www.facebook.com";
		String protocol=url.substring(0,url.indexOf(":"));
		System.out.println(protocol);
		if(protocol.equals("http"))
		{
			System.out.println("Hypertext transfer protocol");
		}
		else if(protocol.equals("ftp"))
		{
			System.out.println("file transfer protocol");
		}
		
		String extension=url.substring(url.lastIndexOf(".")+1,url.length());
		System.out.println(extension);
		if(extension.equals("com"))
		{
			System.out.println("Commercial");
		}
		else if(extension.equals("gov"))
		{
			System.out.println("Government");
		}
		else if(extension.equals("org"))
		{
			System.out.println("Organization");
		}
	}

}
