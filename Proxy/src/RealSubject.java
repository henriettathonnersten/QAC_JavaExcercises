
public class RealSubject implements Subject {

	private String title = "Once In A Lifetime";
	private String artist = "Talking Heads";
	private int length = 259;
	
	public RealSubject () {

	}
	
	public void setSongTitle(String newSongTitle) {
		title = newSongTitle;
	}
	
	public void setArtist(String newArtist) {
		artist = newArtist;
	}
	
	public void setSongTitle(int newSongLength) {
		length = newSongLength;
	}
	
	/*
	 * Other methods that should be private to  
	 * the RealSubject may be added here, such as:
	 * startSong();
	 * pauseSong();
	 * etc.
	*/
	
	
	
	@Override
	public String getSongTitle() {
		return title;
	}
	
	@Override
	public String getArtist() {
		return artist;
	}

	@Override
	public int getSongLength() {
		return length;
	}
	
}