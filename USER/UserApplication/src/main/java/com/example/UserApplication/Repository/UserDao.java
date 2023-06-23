package com.example.UserApplication.Repository;
import com.example.UserApplication.Model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDao {
     List<User> UserList;

    public UserDao()
    {
        System.out.println("This is a Dummy User");
        UserList = new ArrayList<>() ;
        UserList.add(new User("0","srushti","srushtidafe" ,"Nagpur" ,"9145361045"));

    }

    public List<User> fetchAll() {
        return UserList;
    }

    public List<User> getUsersFromDatabase() {
        return UserList;
    }

    public boolean save(User user) {
        UserList.add(user);
        return true;
    }

    public boolean update(String userId, String userName) {
        boolean updateStatus = false;
        for (User user : UserList) {
            if (user.getUserId().equals(userId)){

                remove(user);

                user.setUserName(userName);

                save(user);

                return true;
            }
        }
        return false;
    }

    public boolean remove(User user) {
        UserList.remove(user);
        return true;
    }

}
