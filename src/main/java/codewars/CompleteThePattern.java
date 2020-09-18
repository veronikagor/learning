package codewars;
//
//public class CompleteThePattern {
//    public static String pattern(int n) {
//        StringBuilder bilderNumber = new StringBuilder();
//        StringBuilder bilderString = new StringBuilder();
//        StringBuilder bilderResult = new StringBuilder();
//        String[] str;
//
//        if (n <= 0) {
//            return "";
//        }
//
//        for (int i = 0; i < n + i; i++) {
//            bilderNumber = bilderNumber.append(n);
//            bilderString.append(bilderNumber).append("\n").append("/");
//            n = n - 1;
//        }
//
//        str = bilderString.toString().split("/");
//
//        for (int i = 0; i < str.length / 2; i++) {
//            String temp = str[i];
//            str[i] = str[str.length - 1 - i];
//            str[str.length - 1 - i] = temp;
//        }
//
//        for (int i = 0; i < str.length; i++) {
//            bilderResult.append(str[i]);
//        }
//
//        bilderResult.setLength(bilderResult.length() - 1);
//        return bilderResult.toString();
//
//    }
//}




public class CompleteThePattern {
    public static String pattern(int n) {
        if (n < 1) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                sb.append(j);
            }
            if (i < n)
                sb.append('\n');
        }
        return sb.toString();
    }
}