
public class Client {

	public static void main(String[] args) {		
		
		Subject song = new RealSubject();		
		Subject songProxy = new Proxy();
		
		System.out.println("Currently playing \"" + songProxy.getSongTitle() 
							+ "\" by " + songProxy.getArtist() + ".");
		
	}
}
