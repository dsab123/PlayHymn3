package app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hymn")
public class Hymn {

	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false)
	private String lyrics;
	
	@Id
	private int number;
	
	public Hymn(String nameIn, String lyricsIn, int numberIn) {
		name = nameIn;
		lyrics = lyricsIn;
		number = numberIn;
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
	
	@Override
	public String toString() {
		return number + " | " + name + " | " + lyrics;
	}
	
}
