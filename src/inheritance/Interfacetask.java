package inheritance;
interface TVremote{
	public void volumeUp();
	public void volumeDown();
	public void newChannel();
}
interface smarTvremote extends TVremote{
     public void voice();
     public void netFlix();
     public void youTube();
}
class TV implements smarTvremote{

	@Override
	public void volumeUp() {
		System.out.println("TV plus sign ");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("TV minus sign ");
		
	}

	@Override
	public void newChannel() {
		System.out.println("TV right arrow ");
		
	}

	@Override
	public void voice() {
		System.out.println("TV voice ");
		
	}

	@Override
	public void netFlix() {
		System.out.println("TV NETFLIX");
		
	}

	@Override
	public void youTube() {
		System.out.println("TV YOUTUBE");
	}
	
	
}
public class Interfacetask {

	public static void main(String[] args) {
		TV ob=new TV();
		ob.volumeUp();
		ob.volumeDown();
		ob.newChannel();
		ob.voice();
		ob.netFlix();
		ob.youTube();

	}

	
}
