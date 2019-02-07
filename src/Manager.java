
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Manager{
    private Map<String,User> users;
    private User active;

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

    private boolean login (String username, String password){
        if (users.get(username).getPassword().equals(password)) {
            this.active=users.get(username); // login successful do X
            return true;
        }
        else return false; // login fail : do Y
    }

    private void loadData(){
        File f = new File("manager.txt");
        if (f.exists()) {
            try {
                FileInputStream fis = new FileInputStream("manager.txt");
                ObjectInputStream ois = new ObjectInputStream(fis);

                users = (Map<String, User>) ois.readObject();

                ois.close();


            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        else this.users=new HashMap<>();
    }

    private void saveData() {
        try {
            FileOutputStream fos = new FileOutputStream("manager.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(this);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        Manager manager = new Manager();
        manager.loadData();
        //do smth
        manager.saveData();
    }
}