package lesson8.Student;
/*
        В классе Demo создайте два метода: createHighestParent, createLowestChild который создают и возвращают Объекты самого
        высокого родиделя и самого низкого наследника в данной иерархии*/
public class Demo2 {

    Student createHighestParent() {

        Student student = new Student("Oleg", "Anashkin", 29, new Course[5]);
        return student;

    }


    SpecialStudent createLowestChild() {
        SpecialStudent specialStudent = new SpecialStudent( "Oleg", "Anashkin", 29, new Course[5], 435309300, "email@ukr.net");

        return specialStudent;
    }
}
