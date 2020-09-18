package codewars;
public class Atm {
        public int solve(int n) {
                return n % 10 != 0 ? -1 : (n % 500) + (n % 200) + (n % 100) + (n % 50) + (n % 20) + (n % 10);
        }
}