package lesson3;

//Посчитайте сумму чисел на на промежутке от 1 до 1000 включительно.
//Потом посчитайте целую часть от деления этой суммы на число 1234, а так же остаток от деления.
//Выведите в консоль true если сумма остатка от деления больше и false в другом случае.
//В данном упражнении нельзя использовать if/else конструкцию даже если вы с ней знакомы :)
public class SumAndDivision {
    public static void main (String args[]){
        int sum=0;
        for(int x = 1; x <= 1000; x++){
            sum = sum + x;}
        System.out.println(sum);
        int res = sum%1234;
        int res2 = sum/1234;
        System.out.println(res);
        System.out.println(res2);
        boolean ecv = res>res2;
        System.out.println(ecv);
    }
}

