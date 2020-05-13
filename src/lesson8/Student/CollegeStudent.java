package lesson8.Student;
        /*Класс CollegeStudent, который является наследником Student
        У этого класса есть ряд дополнительных полей
        String collegeName
        int rating
        long id

        И два конструктора, один такой же как у Student и один со всеми полями текущего класса*/

public class CollegeStudent extends Student {
    String collegeName;
    int rating;
    long id;

    public CollegeStudent(String firstName, String lastName, int group, Course[] coursesTaken) {
        //super(firstName, lastName, group, coursesTaken);
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.coursesTaken = coursesTaken;
    }

    public CollegeStudent(String firstName, String lastName, int group, Course[] coursesTaken, String collegeName, int rating, long id) {
        super(firstName, lastName, group, coursesTaken);
        this.collegeName = collegeName;
        this.rating = rating;
        this.id = id;
    }
}


