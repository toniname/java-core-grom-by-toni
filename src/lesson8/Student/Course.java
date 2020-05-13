package lesson8.Student;
/*Создайте следующую иерархию классов.
        Класс Course, поля:
        Date startDate
        String name
        int hoursDuration
        String teacherName
        Student[] students
        Должен содержать конструктов со всеми полями */
import java.util.Date;

public class Course {
    Date startDate;
    String name;
    int hoursDuration;
    String teacherName;
    Student[] students;

    public Course(Date startDate, String name, int hoursDuration, String teacherName, Student[] students) {
        this.startDate = startDate;
        this.name = name;
        this.hoursDuration = hoursDuration;
        this.teacherName = teacherName;
        this.students = students;
    }
}
