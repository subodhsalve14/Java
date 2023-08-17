import java.util.Scanner;

public class while4 {
    public static void main(String args[]) {

        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println(sum);

        sc.close();

    }
}
