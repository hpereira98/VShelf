package business;

import java.util.ArrayList;
import java.util.List;

public class Type {
	private String name;
	private List<String> tags;

	public Type(){
		this.name="";
		this.tags=new ArrayList<>();
	}

	public Type(String name, List<String> tags) {
		this.name=name;
		this.tags=tags;
	}

	public Type(Type t){
		this.name=t.getName();
		this.tags=t.getTags();
	}

	public String getName(){
		return this.name;
	}

	public List<String> getTags(){
		List<String> newL = new ArrayList<>();
		for (String tag : this.tags) newL.add(tag);
		return newL;
	}

	public void setName(String name){
		this.name=name;
	}

	public void setTags(List<String> tags){
		this.tags=tags;
	}
}