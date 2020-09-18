package blinovtask;

import java.util.Scanner;

public class ReverseArgs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input arguments");
        String inputString = in.nextLine();
        String reversedString = new StringBuffer(inputString).reverse().toString();
        System.out.println("Reversed arguments: \n" + reversedString);
        in.close();

    }

}
