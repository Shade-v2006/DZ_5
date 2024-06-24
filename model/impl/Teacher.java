package model.impl;


import java.util.ArrayList;
import java.util.List;

import model.DB.DataBase;
import model.User;

// import model.User;
// import model.DB.DataBase;

public class Teacher extends User{

    public final static List<Integer> groups = new ArrayList<>();
    
    public Teacher(String name, String lastName) {
        super(name, lastName);
        this.id = DataBase.teachersDB.size() + 1;
    }
}