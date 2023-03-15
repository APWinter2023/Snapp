package model;

import logic.travel.Travel;
import logic.user.User;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private final List<User> users = new ArrayList<>();
    private final List<Travel> travels = new ArrayList<>();
    private User loggedInUser;
    private boolean login(String username , String password){
        for (int i = 0; i < users.size(); i++) {
            if (username.equals(users.get(i).getUsername())){
                if (users.get(i).getPassword().equals(password)){
                    loggedInUser = users.get(i);
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        return false;

    }
}
