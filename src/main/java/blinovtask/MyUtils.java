package blinovtask;

import static java.lang.System.out;

public class MyUtils {
    public static void main(String[] args) {
        reversMassive(new int[]{1,2,3});

    }
    public static void reversMassive(int[] myList) {
        for (int i = myList.length - 1; i >= 0; i--) {
            out.println(myList[i] + " ");
        }
    }

    public static void printStringsFromNewLine (int stringsCount) {
        for (int i = 0; i < stringsCount; i++ ) {
            out.println("123");
        }
    }
}
//        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
//        BufferedReader reader = new BufferedReader(inputStreamReader);
//        try {
//            System.out.println("Введите сообщение и нажмите <Enter>");
//            String inputMessage = reader.readLine();
//            String invertedMessage = new StringBuffer(inputMessage).reverse().toString();
//            out.println(invertedMessage):
//        } catch (
//                IOException e) {
//            out.println("Ошибка ввода " + e);
//        }
//
//    }
////    public static void scanConsole() {
////        Scanner in = new Scanner(System.in);
////        System.out.println("Enter the quantity of random numbers and press <Enter>");
////        try {
////            if (in.hasNextInt()) {
////                quantityOfRandomNumbers = in.nextInt();
////            } else {
////                System.out.println("You entered not an integer");
////            }
////            in.close();
////        } catch (NumberFormatException e) {
////            System.out.println("Input Error " + e);
////        }
////    }