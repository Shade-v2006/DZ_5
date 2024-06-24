package controller;

import java.util.List;



import model.StudentGroup;
import model.impl.Student;
import model.impl.Teacher;
import service.StudentGroupService;

public class StudentGroupController {
    
    private StudentGroupService service = new StudentGroupService();
    private TeacherController tService = new TeacherController();

    public StudentGroup createStudentGroup(Teacher t, List<Student> s){
        return service.createStudentGroup(t, s);
        // return service.createStudentGroup(t, s);
    }

    public StudentGroup getStudentGroup(int t, List<Integer> s){
        return service.getStudentGroup(tService.getById(t), s);
    }
    
}