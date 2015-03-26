package app;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull; 

@Entity
public class Hymn {

	@NotNull
	private String name;
	@NotNull
	private String lyrics;
	@Id
	private int number;
	
	public Hymn(String nameIn, String lyricsIn, int numberIn) {
		name = nameIn;
		lyrics = lyricsIn;
		number = numberIn;
	}

	// for JPA
	public Hymn() {
		
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
