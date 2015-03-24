package app;

public class Hymn {

	
	private String name;
	private String lyrics;
	private int number;
	
	public Hymn(String nameIn, String lyricsIn, int numberIn) {

		name = nameIn;
		lyrics = lyricsIn;
		number = numberIn;
	}
	
	public String getName() {
		return name;
	}
	
	public String getLyrics() {
		return lyrics;
	}
	
	public int getNumber() {
		return number;
	}
	
}
