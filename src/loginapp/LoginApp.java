/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loginapp;

import java.util.Arrays;
import java.util.List;
import loginapp.model.User;


/**
 *
 * @author Jon Areas, @jxareas
 */
public class LoginApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        List<User> listOfUsers = Arrays.asList(
                   new User(1, "jxareas", "123"),
                   new User(2, "www", "000")
           );
        
        for(User user : listOfUsers) {
            System.out.println(user);
        }
        
           
           
           
        
    }
    
}
