package codewars;

public class ExampleKata {
    public static int[] multiples(int m, int n) {
        int[] number = new int[m];
        for (int i = 1; i <= m; i++) {
                number[i-1] = n * i;
            }
        return number;
    }
}