
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Book {
	private String name;
	private int year;
	private int edition;
	private Type type;
	private String publisher;
	private String author;
	private LocalDate added;
	private boolean read;
	private LocalDate readDate;
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
		readDate=null;
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
		this.readDate=b.getReadDate();
		this.rating=b.getRating();
		this.rating=0;
		this.obs=b.getObs();
	}

	public Book(String name, int year, int edition, Type type, String publisher, String author, LocalDate added, boolean read, LocalDate readDate, int rating, String obs){
		this.name=name;
		this.year=year;
		this.edition=edition;
		this.type=type;
		this.publisher=publisher;
		this.author=author;
		this.added=added;
		this.read=read;
		this.readDate=readDate;
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

	public Type getType(){
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

	public LocalDate getReadDate(){
		return this.readDate;
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

	public void setType(Type t){
		this.type=t;
	}

	public void setPublisher(String p){
		this.publisher=p;
	}

	public void setAuthor(String author){
		this.author=author;
	}

	public void setAdded(LocalDate a){
		this.added=added;
	}

	public void setRead(boolean b){
		this.read=b;
	}

	public void setReadDate(LocalDate rd){
		this.readDate=rd;
	}

	public void setRating(int r){
		this.rating=r;
	}

	public void setObs(String o){
		this.obs=o;
	}
}