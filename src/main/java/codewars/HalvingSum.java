package codewars;
public class HalvingSum {
int halvingSum(int n) {
int sum = n;
for (int i = 0; i < sum; i++) {
    sum = sum + n / 2;
    n = n / 2;
}
return sum;
}
}


//public class HalvingSum {
//    int halvingSum(int n) {
//        return n == 1 ? 1 : n + halvingSum(n/2);
//    }
//}