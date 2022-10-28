package com.jxareas.konnect.data;

import com.jxareas.konnect.model.User;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Jon Areas, @jxareas
 */
public class FakeUserData {
    
    public static List<User> fakeUsers = Arrays.asList(
            new User(1, "jxareas", "jxareas"),
            new User(2, "sudo", "sudo"),
            new User(3, "algrigor", "something")
    );
    
}
