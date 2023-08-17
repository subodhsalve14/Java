import java.util.*;

public class ternary2 {
    public static void main(String args[]) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        String type = (number % 2 == 0) ? "true" : "false";

        System.out.println(type);
        sc.close();

    }
}
