package com.example.UserApplication.Services;


import com.example.UserApplication.Model.User;
import com.example.UserApplication.Repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userdao;

    public List<User> getAllUsers() {
        return userdao.fetchAll();
    }

    public User getUserById(String userId) {
        if(userId != null) {
            List<User> userList = userdao.getUsersFromDatabase();
            for (User user : userList) {
                if (user.getUserId().equals(userId)) {
                    return user;
                }
            }
        }
        return null;
    }

    public String addNewUser(User user) {
        boolean status = userdao.save(user);
        if(status){
            return"Added......!!!!";
        }else{
            return "Not Added..!!";
        }
    }

    public String updateUserById(String userId,String userName ){
        boolean updateStatus = userdao.update(userId ,userName);
        if(updateStatus){
            return"User with id"+ userId +" was updated...!";
        }else{
            return"User with id"+ userId +" was not updated...!";
        }
    }


    public String deleteUserById(String userId) {
        boolean deleteResponce = false;
        String status;
        if(userId != null){
            List<User> userList = userdao.getUsersFromDatabase();
            for(User user: userList){
                if(user.getUserId().equals(userId)){
                    deleteResponce = userdao.remove(user);
                    if(deleteResponce){
                        status = "User with id"+ userId +" was deleted...!";
                    }else{
                        status ="User with id"+ userId +" was not deleted...!";
                    }
                    return status;
                }
            }
            return "User with id"+ userId +" Does not exist...!";
        }else{
            return "Invalid id";
        }
    }
}
