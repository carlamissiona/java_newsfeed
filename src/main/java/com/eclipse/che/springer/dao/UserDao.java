package com.eclipse.che.springer.dao;

import com.eclipse.che.springer.dto.User;

public interface UserDao {
    
    User readUser(int userid);
    
    int addUser(User u);
    
    int deleteUser(int userid);
    
    void editUser(User u);
   
   User readUserByEmail(String email);
       
    
}
