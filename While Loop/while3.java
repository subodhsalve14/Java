import java.util.*;

public class while3 {
    public static void main(String args[]) {

        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int counter = 1;

        while (counter <= range) {
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println();

        sc.close();

    }
}
