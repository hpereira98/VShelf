
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;

public class Manager {
    private Map<String,User> users;

    public Manager() {
        this.users=new HashMap<>();
    }

    public Manager(Map<String,User> u){
        this.users=u;
    }

    public void addUser (User u) {
        if (users.containsKey(u.getUsername())) System.out.println("User already registered.");
        else {
            users.put(u.getUsername(),u);
        }
    }

    public User getUser (String n){
        return users.get(n);
    }

    public void loadData(){

    }

    public void saveData(){

    }

    public void main (String []args){
        loadData();
        //do stuff
        saveData();
    }

}