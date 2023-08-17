import java.util.*;

public class question1 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : " );
        int number = sc.nextInt();

        if (number >= 0) {
            System.out.println("positive");
        } else {
            System.out.println("negative");
        }

        sc.close();

    }
}