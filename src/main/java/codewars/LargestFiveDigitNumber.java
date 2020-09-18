package codewars;

public class LargestFiveDigitNumber {
    public static int solve(final String digits) {
        int max = 0;
        for (int i = 0; i < digits.length() - 4; i ++){
           int k = Integer.parseInt(digits.substring(i, i + 5));
            for (int j = 0; j < digits.length() - 4; j++){
            if (k >= max){
                max = k;
            }
            }
        }
        return max;
    }
}


