package lesson8.Student;
    /* Класс Student с полями:
            String firstName
            String lastName
            int group
            Course[] coursesTaken
            int age

            У класса должен быть конструктор:
            firstName, lastName, group, coursesTaken

     */
public class Student {
    String firstName;
    String lastName;
    int group;
    Course[] coursesTaken;
    int age;

    public Student(String firstName, String lastName, int group, Course[] coursesTaken) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.coursesTaken = coursesTaken;

    }

    public Student() {
    }
}
