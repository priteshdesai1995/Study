package section14_Interfaces;

class phone
{
	void call()
	{
		System.out.println("Calling...");
	}
	void sms()
	{
		System.out.println("Texting...");
	}
}

class smartphone extends phone implements Cam_Mus,Music
{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println(" Song playing... ");
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		System.out.println(" Song paused... ");
			
	}

	@Override
	public void next() {
		// TODO Auto-generated method stub
		System.out.println(" Song changed to next... ");
		
	}

	@Override
	public void previous() {
		// TODO Auto-generated method stub
		System.out.println(" Song changed to previous... ");
		
	}

	@Override
	public void click() {
		// TODO Auto-generated method stub
		System.out.println(" Photo Captured... ");
		
	}

	@Override
	public void record() {
		// TODO Auto-generated method stub
		System.out.println(" Video is recording... ");
		
	}
	
}
public class Cam_Mus_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		smartphone sp = new smartphone();
		phone p=sp;
		Cam_Mus cm=sp;
		Music m=sp;
		sp.call();
		sp.sms();
		sp.record();
		sp.click();
		sp.play();
		sp.pause();
		sp.next();
		sp.previous();
		p.call();
	}

}
