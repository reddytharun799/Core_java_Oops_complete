package realtimeProjectLibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private List<Transation> transations;

    public User(String username,String password){
        this.username=username;
        this.password=password;
        this.transations=new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Transation> getTransations() {
        return transations;
    }

    public void setTransations(List<Transation> transations) {
        this.transations = transations;
    }
}
