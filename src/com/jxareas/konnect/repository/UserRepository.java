package com.jxareas.konnect.repository;

import com.jxareas.konnect.model.User;
import java.util.List;

/**
 *
 * @author Jon Areas, @jxareas
 */
public interface UserRepository {
   
    List<User> getAll();
    
    void insert(User user);
    
    void insertAll(List<User> users);
    
    boolean exists(User user);
    
    void update(User user);
    
    void deleteById(int userId);
    
}
