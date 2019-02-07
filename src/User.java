

import java.util.HashMap;
import java.util.Map;

import static java.time.LocalDate.now;

public class User {
	private String username;
	private String password;
	private int num_books;
	private Map<Integer,Book> shelf;

	public void rateBook(int book, int val){
	    this.shelf.get(book).setRating(val);
    }

    public void addBook (Book book){
	    this.shelf.put(num_books,book);
	    this.shelf.get(num_books).setAdded(now());
	    num_books++;
    }

    public void removeBook (int book){
	    this.shelf.remove(book,this.shelf.get(book));
    }

	// CONSTRUCTORS

	public User(){
		this.username="";
		this.password="";
		this.num_books=0;
		this.shelf=new HashMap<>();
	}

	public User(String username, String password, int num_books, Map<Integer,Book> shelf){
		this.username=username;
		this.password=password;
		this.num_books=num_books;
		this.shelf=shelf;
	}

	public User(User u){
		this.username=u.getUsername();
		this.password=u.getPassword();
		this.num_books=u.getNumBooks();
		this.shelf=u.getShelf();
	}

	// GETTERS

	public String getUsername(){
		return this.username;
	}

	public String getPassword(){
		return this.password;
	}

	public int getNumBooks(){
		return this.num_books;
	}

	public Map<Integer,Book> getShelf(){
		Map<Integer,Book> newM = new HashMap<>();

		for (int i=0;i<this.num_books;i++){
			Book b = new Book(this.shelf.get(i));
			newM.put(i,b);
		}

		return newM;
	}

	// SETTERS

	public void setUsername(String u){
		this.username=u;
	}

	public void setPassword(String p){
		this.password=p;
	}

	public void setNumBooks(int n){
		this.num_books=n;
	}

	public void setShelf (Map<Integer,Book> s){
		this.shelf=s;
	}

}