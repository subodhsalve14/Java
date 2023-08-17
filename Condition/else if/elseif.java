import java.util.*;

public class elseif {

    public static void main(String args[]) {

        System.out.print("Enter your age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("ADULT");
        } else if (age >= 13 && age < 18) {
            System.out.println("Teenager");
        } else{
            System.out.println("Child");
        }

            sc.close();
    }
}