package lesson3;

public class Ternary {
    public static void main (String args[]){
        int a;
        byte b = 100;
        a = b>200 ? 500 : 350;// а= если b>200 то результат 500 в другом случае 350
        System.out.println(a);
    }
}