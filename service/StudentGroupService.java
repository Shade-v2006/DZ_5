package service;

import java.util.ArrayList;
import java.util.List;

import controller.StudentController;
import model.StudentGroup;
import model.impl.Student;
import model.impl.Teacher;

// import controller.StudentController;
// import model.StudentGroup;
// import model.impl.Student;
// import model.impl.Teacher;

public class StudentGroupService {
    public StudentGroup createStudentGroup(Teacher t, List<Student> s){
        return new StudentGroup(t, s);
    }

    public int getId(){
        return StudentGroup.id;
    }

    public void addStudents(List<Student> s){
        StudentGroup.students.addAll(s);
    }

    public StudentGroup getStudentGroup(Teacher t, List<Integer> s){
        StudentController studentControlle = new StudentController();
        List<Student> ss= new ArrayList<>();
        for (int i : s) {
            Student student = studentControlle.getById(i);
            ss.add(student);
        }
        System.out.println(t);
        System.out.println(ss);
        return createStudentGroup(t, ss);
    }
}
