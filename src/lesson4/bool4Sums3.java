package lesson4;

//Напишите метод, который будет сравнивать сумму чисел на промежутках [a,b], [c, d] включительно и возвращать true если первая сумма больше, и false в другом случае
//Сигнатура метода - compareSums(int a, int b, int c, int d). Для нахождения суммы напишите отдельный метод sum(int from, int to), который будете потом использовать.
public class bool4Sums3 {
    public static void main(String[] args){
        System.out.println(compareSums(6, 56, 10, 20)); //вызов метода compareSums и отправка значений (1, 5, 10, 20)
    }
    public static long sum(int from, int to){//шапка метода отправляет лонг принимает 2 инта
        long res = 0;
        for (int i = from; i<=to; i++){ // проходка по ряду
            res+= i; // сумирование значений
        }
        //System.out.println(res);

        return res;
    }
    public static boolean compareSums(int a, int b, int c, int d){ //отправляет булиан принимает (int a, int b, int c, int d)
        int from = a;
        int to = b;
        long res1 = sum( from, to);//обращение к методу sum(int from, int to) и присваивание к результату long res1
        from = c;
        to = d;
        long res2 = sum( from, to); // обращение к методу sum(int from, int to) и присваивание к результату long res1
        if (res1>res2){
            return true;
        } else {
            return false;
        }
    }
}

