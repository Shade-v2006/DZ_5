package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import controller.StudentController;
import controller.StudentGroupController;
// import controller.TeacherController;
import model.StudentGroup;
import model.DB.DataBase;
import model.impl.Student;

public class StudentView {
    private StudentController controller = new StudentController();
    private StudentGroupController sGroupController = new StudentGroupController();
    // private TeacherController teacherController = new TeacherController();

    public void start(){//замена фронтэнда
        DataBase.fillDB();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 - создать студента");
            System.out.println("2 - найти студжента по id");
            System.out.println("3 - распечатать информацию о всех студентах");
            System.out.println("4 - создать и распечатать группу по id");
            System.out.println("5 - выход");
            
            switch (scanner.nextInt()) {
                case 1 -> createStudent();
                case 2 -> getById();
                case 3 -> getAllStudents();
                case 4 -> getStudentGroup();
                case 5 -> System.exit(0);// выход из приложения
                
                default -> System.out.println("Операция не поддерживается");
                
            }
            
        }

    }

    private Student createStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        System.out.println("Введите фамилию:");
        String lastName = scanner.nextLine();
        System.out.println("Введите номер группы:");
        int groupId = scanner.nextInt();
        Student student = controller.createStudent(name, lastName, groupId);
        System.out.println(student);

        return student;
        
        
    };
    private Student getById(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id пользователя: ");
        int id = scanner.nextInt();
        Student student = controller.getById(id);
        System.out.println(student);

        return student;
    };
    private List<Student> getAllStudents(){
        List<Student> students = controller.getAllStudents();
        System.out.println(students);
        return students;
    };

    private StudentGroup getStudentGroup(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите id преподователя");
        int tId = scanner.nextInt();
        List <Integer> sc = new ArrayList<>();
        System.out.println("Введите колличество студентов:");
        int count = scanner.nextInt();
        System.out.println("Введите id студента");
        for (int i = 0; i != count; i++) {
            sc.add(scanner.nextInt());

        }

        List<Student> students = new ArrayList<>();
        for (Integer c : sc) {
            students.add(controller.getById(c));
        }

        return sGroupController.getStudentGroup(tId, sc);
    }
}