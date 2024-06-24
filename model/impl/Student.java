package model.impl;

import model.User;
import model.DB.DataBase;



public class Student extends User{

    int groupId;

    public Student(int id, String name, String lastName, int groupId) {
        super(name, lastName);
        this.groupId = groupId;
        this.id = id;
        this.id = DataBase.studentsDB.size() + 1; 
    }
}
