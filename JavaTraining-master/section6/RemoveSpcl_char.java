package section6;

public class RemoveSpcl_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="a@sj%bs&sh!";
		System.out.println(str.replaceAll("[@ ! % &]*", ""));
		System.out.println(str.replaceAll("[^a-z A-Z 0-9]*", ""));
		String exspace=" ab   abc ac  abc  a ";
		String es=str.replaceAll("\\s+", " ").trim();
		String no_words[]=es.split("\\s");
		System.out.println(no_words.length);


		
		

	}
	
}
