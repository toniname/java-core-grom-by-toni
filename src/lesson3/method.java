package lesson3;

//Повторите класс PracticeExample с занятия (01:00:20)
public class method {
    public static void main(String[] args){
        System.out.println(min(2, 5, 10));
        System.out.println(min(10, 5, 2));
        System.out.println(min(10, 5, 10));

        System.out.println(average(2));
        System.out.println(average(10));
        System.out.println(average(2, 5));
        System.out.println(count(1, 10, 5));
        //System.out.println(1233435446 % 10); нахождение последней цифры от данного числа (остача от деления на 10)
    }
    public static int min(int a, int b, int c){
        int res = a < b ? a : b;
        return res < c ? res: c;
    }
    public static double average(int n){
        int sum =0;
        for (int i = 1; i<=n; i++){
            sum+=i;
        }
        return (double) sum /n;
    }
    public static double average(int a, int b){
        int sum =0;
        for (int i = a; i<=b; i++){
            sum+= i;
        }
        return (double) sum /(b - a + 1); //нахождение колличества едениц в ряду но при условии если ряд идет по порядку
    }
    public static int count(int a, int b, int n){
        int count = 0;
        for (int i = a; i<=b; i++){
            if(i % 10 == n)
                count++;
        }
        return count;
    }
}
