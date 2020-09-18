package blinovtask;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input name");
        String name = in.nextLine();
        System.out.printf("Hello %s ", name);
        in.close();

    }

}
