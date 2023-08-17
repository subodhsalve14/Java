import java.util.Scanner;

public class calculator {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a : ");
        int a = sc.nextInt();

        System.out.print("Enter number b : ");
        int b = sc.nextInt();

        System.out.print("Enter the operator : ");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("The sum of a + b is : " + (a + b));
                break;

            case '-':
                System.out.println("The subraction of a + b is : " + (a - b));
                break;

            case '*':
                System.out.println("The mutiplication of a + b is : " + (a * b));
                break;

            case '/':
                System.out.println("The division of a + b is : " + (a / b));
                break;

            default:
                System.out.println("Operaotion can't perform");
              
        }

        sc.close();
    }

}
