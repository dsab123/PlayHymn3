package app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hymn")
public class Hymn {

	@Id
	private int number;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String lyrics;
	
	@Column(nullable = false)
	private String mp3Uri;
	
	@Column(nullable = false)
	private String oggUri;
	
	
	
	public Hymn(String nameIn, String lyricsIn, int numberIn, String mp3UriIn, String oggUriIn) {
		name = nameIn;
		lyrics = lyricsIn;
		number = numberIn;
		mp3Uri = mp3UriIn;
		oggUri = oggUriIn;
	}

	// for JPA
	protected Hymn() {
		
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
	
	public String getMp3Uri() {
		return mp3Uri;
	}
	
	@Override
	public String toString() {
		return number + " | " + name + " | " + lyrics;
	}
	
}
