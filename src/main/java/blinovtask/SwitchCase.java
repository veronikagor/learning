package blinovtask;

public class SwitchCase {
    public static void main(String[] args) {
        byte value = 1;
        switch (value) {
            case 4: // code a   /* if value 4 -> code a, code b, code c */
            case 2: // code b   /* if value 2 -> code b, code c */
            case 3: // code c   /* if value 2 -> code c */
                break;
            case 1:
                System.out.println("1");
                break;
            default: throw new IllegalArgumentException(" ... "); // if value 7
        }
    }
}