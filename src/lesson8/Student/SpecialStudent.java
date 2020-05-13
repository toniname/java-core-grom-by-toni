package lesson8.Student;
        /*И наконец, класс SpecialStudent, который есть наследником CollegeStudent
        У него тоже есть дополнительные поля:
        long secretKey
        String email
        И конструктор со всеми полями (выберите конструктор CollegeStudent с меньшим количеством полей)*/

public class SpecialStudent extends CollegeStudent {
    long secretKey;
    String email;


    public SpecialStudent(String firstName, String lastName, int group, Course[] coursesTaken, long secretKey, String email) {
        super(firstName, lastName, group, coursesTaken);
        this.secretKey = secretKey;
        this.email = email;
    }
}
