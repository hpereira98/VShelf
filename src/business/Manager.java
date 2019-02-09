package business;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Manager implements Serializable{
    private Map<String,User> users;
    private User active;

    public Manager() {
        this.users=new HashMap<>();
    }

    public Manager(Map<String,User> u){
        this.users=u;
    }
    
    public boolean userExists(String username) {
        return this.users.containsKey(username);
    }

    public void addUser (User u) {
        if (users.containsKey(u.getUsername())) System.out.println("User already registered.");
        else {
            users.put(u.getUsername(),u);
        }
    }
    
    public User getUser (String name){
        return users.get(name);
    }

    public boolean login (String username, String password){
        if (users.containsKey(username) && users.get(username).getPassword().equals(password)) {
            this.active=users.get(username); // login successful do X
            return true;
        }
        else return false; // login fail : do Y
    }

    public Manager loadData(){
        File f = new File("manager.txt");
        if (f.exists()) {
            try {
                FileInputStream fis = new FileInputStream("manager.txt");
                ObjectInputStream ois = new ObjectInputStream(fis);

                Manager m = (Manager) ois.readObject();

                ois.close();

                return m;


            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
                return new Manager();
            }
        }
        else return new Manager();
    }

    public void saveData() {
        try {
            FileOutputStream fos = new FileOutputStream("manager.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(this);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}