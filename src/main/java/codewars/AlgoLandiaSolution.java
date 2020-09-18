package codewars;

//public class AlgoLandiaSolution {
//    public static int findNeededGuards(boolean[] k) {
//        int count = 0;
//        for (int i = 1; i < k.length - 1; i++) {
//            if (k[i] == false) {
//                if (k[i - 1] == false || k[i + 1] == false) {
//                    count += 1;
//                }
//            }
//        }
//        return count;
//    }
//
//}


public class AlgoLandiaSolution {
    public static int findNeededGuards(boolean[] k) {
        int count = 0;
        for (int i = 0; i < k.length; i++) {
            System.out.println(k[i]);
        }

        int suffix = 1;
        if (k.length > 5) {
            suffix = 2;
        }
        for (int i = 1; i < k.length - suffix; i += 2) {
            if ((k[i] == false) & (k[i - 1] == false | k[i + 1] == false)) {
                count += 1;
            }
        }
//        if (k[0] == false && k[1]== false && k[2] == true){
//            count++;
//        }
//        if (k[k.length-1] == false && k[k.length-2]== false && k[k.length-3] == true){
//            count++;
//        }
        return count;
    }

}