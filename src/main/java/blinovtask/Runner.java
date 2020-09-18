package blinovtask;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность матрицы");
        int n = in.nextInt();
        Matrix p = MatrixFactory.createRandomized(n);
        System.out.println("Matrix is: " + p);

//        int n = 2, m = 3, l = 4;
//        Matrix q = MatrixFactory.createRandomized(m, l);
//        System.out.println("Matrix second is: " + q);
//        try {
//            Matrix result = Multiplicator.multiply(p, q);
//            System.out.println("Matrix product is: "
//                    + result);
//        } catch (MultipleException e) {
//            System.err.println("Matrices could"
//                    + " not be multiplied: ");
//        }
    }
}