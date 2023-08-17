public class reversethegivennumber {
    public static void main(String args[]) {

        int rev = 0;
        int n = 1462005;
        while (n > 0) {
            int LastDigit = n % 10;
            rev = (rev * 10) + LastDigit;
           n /= 10;
        }
          System.out.println(rev);
    }
}
