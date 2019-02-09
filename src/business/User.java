package business;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import static java.time.LocalDate.now;
import java.util.ArrayList;
import java.util.List;

public class User {
	private String username;
	private String password;
	private List<Book> shelf;

    public void addBook (Book book){
	this.shelf.add(book);
    }
    
    public void updateBook(Book newBook,Book book) {
        this.shelf.remove(book);
        this.shelf.add(newBook);
    }

    public void removeBook (Book book){
	this.shelf.remove(book);
    }

	// CONSTRUCTORS

	public User(){
		this.username="";
		this.password="";
		this.shelf=new ArrayList<>();
	}

	public User(String username, String password, int num_books, List<Book> shelf){
		this.username=username;
		this.password=password;
		this.shelf=shelf;
	}

	public User(User u){
		this.username=u.getUsername();
		this.password=u.getPassword();
		this.shelf=u.getShelf();
	}

	// GETTERS

	public String getUsername(){
		return this.username;
	}

	public String getPassword(){
		return this.password;
	}

	public List<Book> getShelf(){
		List<Book> newList = new ArrayList<>();

		for (Book b : this.shelf){
			newList.add(b);
		}

		return newList;
	}

	// SETTERS

	public void setUsername(String u){
		this.username=u;
	}

	public void setPassword(String p){
		this.password=p;
	}

	public void setShelf (List<Book> s){
		this.shelf=s;
	}

}