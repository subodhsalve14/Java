import java.util.*;

public class multipleof10continue {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter number : ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                continue;
            }
            System.out.println("number was" + n);

        } while (true);

    }
}
