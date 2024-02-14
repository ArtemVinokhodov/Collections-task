package view;

import entity.Users;

import java.util.ArrayList;

public class View {
    public ArrayList<Users> getUsers() {
        ArrayList<Users> list = new ArrayList<>();

        Users user1 = new Users("A", "1@gm.com");
        Users user2 = new Users("B", "2@gm.com");
        Users user3 = new Users("C", "3@gm.com");
        Users user4 = new Users("D", "4@gm.com");
        Users user5 = new Users("E", "5@gm.com");

        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);

        return list;
    }
}
