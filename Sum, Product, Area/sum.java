import java.util.*;

public class sum {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("The value of a is ");
        int a = sc.nextInt();

        System.out.print("The value of b is ");
        int b = sc.nextInt();

        int sum=a+b;
        // System.out.println(a+b);
        System.out.println("The sum of a and b is "+ sum);

        sc.close();
    }
}