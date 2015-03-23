package app;

public class Hymn {

	private String uri;
	private String name;
	private String lyrics;
	
	public Hymn(String uriIn, String nameIn, String lyricsIn) {
		uri = uriIn;
		name = nameIn;
		lyrics = lyricsIn;
	}
	
	public String getUri() {
		return uri;
	}
	
	public String getName() {
		return name;
	}
	
	public String getLyrics() {
		return lyrics;
	}
	
}
