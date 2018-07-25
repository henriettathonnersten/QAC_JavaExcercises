
public class Proxy implements Subject {
	
	@Override
	public String getSongTitle() {		
		RealSubject realSubject = new RealSubject();	
		return realSubject.getSongTitle();
	}

	@Override
	public String getArtist() {
		RealSubject realSubject = new RealSubject();		
		return realSubject.getArtist();
	}

	@Override
	public int getSongLength() {
		RealSubject realSubject = new RealSubject();		
		return realSubject.getSongLength();
	}
	
}
