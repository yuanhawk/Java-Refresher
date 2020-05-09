package business;

public class Album extends Product {
	
	private String artist;
	
	public Album() {
		super();
		artist = "";
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	@Override
	public String toString() {
		return super.toString() + " (" + artist + ")";
	}

}
