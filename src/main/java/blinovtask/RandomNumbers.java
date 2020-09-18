package blinovtask;

import java.util.Scanner;

public class RandomNumbers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество рандомных чисел");
        int quantity = 0;

        if (in.hasNextInt()) {
             quantity = in.nextInt();
        } else {
            System.out.println("Вы ввели не целое число");
        }
        in.close();

        for (int i = 0; i < quantity; i++){
            double num = Math.random() * 10;
            StringBuilder bilder = new StringBuilder();
            bilder.append((int)num);
            System.out.print(bilder.toString() + ", ");
        }


}
}
