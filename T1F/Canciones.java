package es.florida.T1F;

public class Canciones {

	int id;
	String title;
	String album;
	String author;
	int year;
	
	
	public Canciones(int i, String t, String alb, String au, int y) {
		id = i;
		title = t;
		album = alb;
		author = au;
		year = y;
	}

	public Canciones() {
		
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAlbum() {
		return album;
	}


	public void setAlbum(String album) {
		this.album = album;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}

	

}
