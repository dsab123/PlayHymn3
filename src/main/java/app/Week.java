package app;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="week")
public class Week {

	@Id
	@Column(nullable = false)
	private String date;

	@Column
	private int hymn1;

	@Column
	private int hymn2;

	@Column
	private int hymn3;

	public Week() {

	}

	public Week(String dateIn, int hymn1In, int hymn2In, int hymn3In) {
		date = dateIn;
		hymn1 = hymn1In;
		hymn2 = hymn2In;
		hymn3 = hymn3In;
	}

	public String getDate() {
		return date;
	}

	public int getHymn1() {
		return hymn1;
	}

	public int getHymn2() {
		return hymn2;
	}

	public int getHymn3() {
		return hymn3;
	}

	@Override
	public String toString() {
		return date + ": " + hymn1 + ", " + hymn2 + ", " + hymn3;
	}


}
