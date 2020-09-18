package blinovtask;

public class WhileIfElse {
    public static void main(String[] args) {
        int value = 42;
        while (value < 50) {
            value++;
            if (value > 44 && value < 48) {
                continue; // вывод 43 44
            }
            System.out.println(value);

        }
    }
}
