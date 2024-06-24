package service;

import model.DB.DataBase;
import model.StudentGroup;
import model.impl.Teacher;


public class TeacherService {

    private static StudentGroupService studentGroupService = new StudentGroupService();

    public Teacher createTeacher(String name, String lastName){
        Teacher t = new Teacher(name, lastName);
        DataBase.teachersDB.add(t);
        return t;
    }
    
    public void addGroupId(StudentGroup s){
        int id = studentGroupService.getId();
        Teacher.groups.add(id);
    }

    public Teacher getById(int id) throws Exception {
        Teacher teacher = DataBase.teachersDB//список студентов
                .stream()//запускаем поток для вычислений
                // пример лямда-выражения (s -> s.getId() == id)
                .filter(s -> s.getId() == id)//вызываем метод filter фильтруя по условию (s = student(переменная))
                .findFirst()//вернуть первого найденого студента
                .orElse(null);// если не нашли вернуть null (orElse закрывет поток stream)
        if (teacher == null) {
            throw new Exception("Преподователь не найден");//выбрасываем проверяемое исключение, которое компилятор требует отработать
        }
        return teacher;
    }
}