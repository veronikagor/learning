package codewars;

public class Solution {

    public static boolean isAscOrder(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) return false;
        }
        return true;
    }

}


//        boolean result = true;
//        for (int i = 0; i < arr.length - 1; i++) {
//            if(arr[i] > arr[i + 1]){
//                 result = false;
//                 break;
//            } else {
//                 result = true;
//            }
//
//        }
//     return result;
//
//    }
//
//}