package Model;

import java.util.ArrayList;

public class UserAccount {
    private String password;
    private String userName;
    public String name;
    public int id;
    public String gender;
    public String email;
    public boolean isAdmin;
    public ArrayList<Song> favoriteSong;

    //constructor
    public UserAccount() {
    }

    public UserAccount(int id, String userName, String password, String name, String gender, String email, boolean isAdmin) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.isAdmin = isAdmin;
        favoriteSong = new ArrayList<>();
    }

    // Get set method
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
