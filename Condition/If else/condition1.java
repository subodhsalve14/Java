import java.util.Scanner;

public class condition1 {
    public static void main(String args[]) {

        System.out.print("Enter your age : ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Drive , Vote");
        } else if (age >= 13 && age < 18) {
            System.out.println("Teenager");
        } else {
            System.out.println("Not Eligible");
        }
        sc.close();
    }

}