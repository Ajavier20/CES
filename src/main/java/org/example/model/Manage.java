package org.example.model;

import java.util.ArrayList;

public class Manage {
    private ArrayList<User> users;

    public Manage() {
        this.users = new ArrayList<>();
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void addUser(User user){
        users.add(user);
    }

    public User check(String email, String password){
        for(User user: users){
            if(user.match(email,password)){
                return user;
            }
        } return null;
    }
}
