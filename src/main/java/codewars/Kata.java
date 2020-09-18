package codewars;

public class Kata {
    public static String womensAge(int n) {
        int real = (n % 2 == 0) ? 20 : 21;
        int base = (n % 2 == 0) ? n/2 : (n - 1)/2;
//        if (n % 2 == 0) {
//            real = 20; base = n/2;
//        } else {
//            real = 21; base = (n - 1)/2;
//        }

//        if (n % 2 == 0) {
//            base = n/2;
//        } else {
//            base = (n - 1)/2;
//        }
        return n + "? That's just " + real + ", in base " + base + "!";
    }
}
