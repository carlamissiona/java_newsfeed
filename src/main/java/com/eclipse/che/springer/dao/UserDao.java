package com.eclipse.che.springer.dao;

import com.eclipse.che.springer.dto.User;

public interface UserDao {
    
    User readUser(int userid);
    
    int addUser(User u);
    
    int deleteUser(int userid);
    
    int editUser(User u);
       
    
}
