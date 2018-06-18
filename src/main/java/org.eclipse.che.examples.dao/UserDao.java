package org.eclipse.che.examples.dao;

import org.eclipse.che.examples.dto.User;

public interface UserDao {
    
    User readUser(int userid);
    
    int addUser(User u);
    
    int deleteUser(int userid);
    
    int editUser(User u);
       
    
}
