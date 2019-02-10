package business;

import java.io.Serializable;
import java.time.LocalDate;

public class Book implements Serializable{
	private String name;
	private int year;
	private int edition;
	private String type;
	private String publisher;
	private String author;
	private LocalDate added;
	private boolean read;
	private int rating;
	private String obs;

	// CONSTRUCTORS

	public Book(){
		name="";
		year=-1;
		edition=-1;
		type=null;
		publisher=null;
		author="";
		added=LocalDate.now();
		read=false;
		int rating=-1;
		obs="";
	}

	public Book(Book b){
		this.name=b.getName();
		this.year=b.getYear();
		this.edition=b.getEdition();
		this.type=b.getType();
		this.publisher=b.getPublisher();
		this.author=b.getAuthor();
		this.added=b.getAdded();
		this.read=b.getRead();
		this.rating=b.getRating();
		this.obs=b.getObs();
	}

	public Book(String name, int year, int edition, String type, String publisher, String author, LocalDate added, boolean read, int rating, String obs){
		this.name=name;
		this.year=year;
		this.edition=edition;
		this.type=type;
		this.publisher=publisher;
		this.author=author;
		this.added=added;
		this.read=read;
		this.rating=rating;
		this.obs=obs;
	}

	// GETTERS

	public String getName(){
		return this.name;
	}

	public int getYear(){
		return this.year;
	}

	public int getEdition(){
		return this.edition;
	}

	public String getType(){
		return this.type;
	}

	public String getPublisher(){
		return this.publisher;
	}

	public String getAuthor(){
		return this.author;
	}

	public LocalDate getAdded(){
		return this.added;
	}

	public boolean getRead(){
		return this.read;
	}

	public int getRating(){
		return this.rating;
	}

	public String getObs(){
		return this.obs;
	}

	// SETTERS

	public void setName(String n){
		this.name=n;
	}

	public void setYear(int y){
		this.year=y;
	}

	public void setEdition(int e){
		this.edition=e;
	}

	public void setType(String t){
		this.type=t;
	}

	public void setPublisher(String p){
		this.publisher=p;
	}

	public void setAuthor(String author){
		this.author=author;
	}

	public void setAdded(LocalDate a){
		this.added=a;
	}

	public void setRead(boolean b){
		this.read=b;
	}

	public void setRating(int r){
		this.rating=r;
	}

	public void setObs(String o){
		this.obs=o;
	}
}