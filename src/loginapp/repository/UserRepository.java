/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginapp.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import loginapp.model.User;

/**
 *
 * @author Jon Areas, @jxareas
 */
public class UserRepository {
    
   
    private List<User> listOfUsers = new ArrayList<>();
    
    public List<User> getAll() {
        return listOfUsers;
    }
    
    public void insert(User user) {
        listOfUsers.add(user);
    }
    
    public void insertAll(List<User> users) {
        listOfUsers.addAll(users);
    }
    
    public void insertAll(User... users) {
        List<User> newUsers = Arrays.asList(users);
        listOfUsers.addAll(newUsers);
    }
    
    public void update(int userId) {
        // TODO: Update users
    }
    
    
    
    
    
    
    
}
