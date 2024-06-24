package model.DB;

import java.util.ArrayList;
import java.util.List;

import model.StudentGroup;
import model.impl.Student;
import model.impl.Teacher;
import service.TeacherService;

//DataBase
public class DataBase {
    public static final List<Student> studentsDB = new ArrayList<>();

    public static final List<Teacher> teachersDB = new ArrayList<>();

    public static final List<StudentGroup> StudentGroupDB = new ArrayList<>();

    public static void fillDB(){
        Teacher teacher = new Teacher("Вася", "Иванов");
        StudentGroup studentGroup = new StudentGroup(teacher);
        TeacherService tService = new TeacherService();
        tService.addGroupId(studentGroup);
        teachersDB.add(teacher);
        Student s1 = new Student(1, "Рикон", "Старк", 1);
        Student s2 = new Student(2, "Джофри", "Ланистер", 1);
        studentsDB.add(s1);
        studentsDB.add(s2);
//        studentGroupService.addStudents(studentsDB);
    }
}
