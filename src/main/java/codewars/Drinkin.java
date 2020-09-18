package codewars;

import java.util.regex.Pattern;

public class Drinkin {
    public String hydrate(String drinkString) {
        String[] str = drinkString.split(", | and ");
        int sum = 0;

        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
            sum += Integer.parseInt(String.valueOf(str[i].charAt(0)));
        }
        return sum > 1 ? sum + " glasses of water" : sum + " glass of water";
    }
}


//import java.util.regex.*;
//
//public class Drinkin {
//
//    public String hydrate(String drinkString) {
//        long n = Pattern.compile("[^\\d]+")
//                .splitAsStream(drinkString)
//                .mapToInt( s -> Integer.parseInt(s) )
//                .sum();
//        return String.format("%d glass%s of water", n, n==1?"":"es");
//    }
//}



//public class Drinkin {
//
//    public String hydrate(String drinkString) {
//        int n = 0;
//        for (String word : drinkString.split(" ")) {
//            try { n += Integer.valueOf(word); } catch (NumberFormatException ex) { }
//        }
//        return String.format("%d glass%s of water", n, n==1?"":"es");
//    }
//
//}