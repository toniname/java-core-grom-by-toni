package lesson3;

public class LoopExercise2{
    public static void main (String args[]){
        long sum=0;
        for(long x = 1; x <= 10000000; x++){
            sum = sum + x;
        }
        System.out.println(sum);

    }

}