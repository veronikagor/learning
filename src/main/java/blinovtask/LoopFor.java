package blinovtask;

public class LoopFor {
    public static void main(String[] args) { //сумма первых 100 натуральрых чисел -> 5050
        int i = 1;
        int sum = 0;
        for (; i <= 100; i++) {
            sum += i;
            System.out.println(sum); //5050
        }

//        int sum = 0;
//        for(int i = 1; i <= 100; ){
//            sum += i++;
//            System.out.println(sum); //5050
//
//        }

//        for(int i = 1, sum = 0; i <= 100; sum += i++){
//            System.out.println(sum); //4950
//        }

//        for(int i = 0, sum = 0; i++, i <= 100; sum += i); // incorrect!
    }
}