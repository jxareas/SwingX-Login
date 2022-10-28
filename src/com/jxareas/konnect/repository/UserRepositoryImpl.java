package com.jxareas.konnect.repository;

import com.jxareas.konnect.data.FakeUserData;
import com.jxareas.konnect.model.User;
import java.util.List;

/**
 *
 * @author Jon Areas, @jxareas
 */
public class UserRepositoryImpl implements UserRepository {
    
    private List<User> userList = FakeUserData.fakeUsers;

    @Override
    public List<User> getAll() {
      return userList;
    }

    @Override
    public void insert(User user) {
     user.setId(userList.size() + 1);
     userList.add(user);
    }

    @Override
    public void insertAll(List<User> users) {
      userList.addAll(users);
    }

    @Override
    public boolean exists(User user) {
        return userList.stream()
                .anyMatch(currentUser -> currentUser.equals(user));
                
    }

    @Override
    public void update(User user) {
     
    }

    @Override
    public void deleteById(int userId) {
        userList.removeIf(user -> user.getId() == userId);
    }
    
}
