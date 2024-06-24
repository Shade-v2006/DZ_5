package model;

import java.util.List;

import model.DB.DataBase;
import model.impl.Student;
import model.impl.Teacher;

// import model.DB.DataBase;
// import model.impl.Student;
// import model.impl.Teacher;

public class StudentGroup {

    public static int id;

    public String name;

    public Teacher teacher;
    public static List<Student> students;
    
    public StudentGroup(Teacher t, List<Student> s){
        StudentGroup.students = s;
        this.teacher = t;
        StudentGroup.id = DataBase.StudentGroupDB.size() + 1;
    }

    public StudentGroup(Teacher t){
        this.teacher = t;
        StudentGroup.id = DataBase.StudentGroupDB.size() + 1;
    }
}
