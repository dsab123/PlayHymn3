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
	private String uri;
	
	public Hymn(String nameIn, String lyricsIn, int numberIn, String uriIn) {
		name = nameIn;
		lyrics = lyricsIn;
		number = numberIn;
		uri = uriIn;
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
	
	public String getUri() {
		return uri;
	}
	
	@Override
	public String toString() {
		return number + " | " + name + " | " + lyrics;
	}
	
}
