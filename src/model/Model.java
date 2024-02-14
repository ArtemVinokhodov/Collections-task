package model;

import entity.Users;

import java.util.ArrayList;

public class Model {
    public void getUsersId(ArrayList<Users> list, int index) {
        String output = list.get(index).toString();
        System.out.println(output);
    }

    public void getAllUsers(ArrayList<Users> list) {
        int count = 0;
        for (Users user : list) {
            count++;
            String output = count + ") User name " + user.getName() +
                    " has email address " + user.getEMaile();
            System.out.println(output);
        }
    }
}
