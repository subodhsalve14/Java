import java.util.*;

public class question3 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the week number(1-7)  : ");
        int week = sc.nextInt();

        switch(week){
            case 1:System.out.println("Monday");
            break;

             case 2:System.out.println("Tuesday");
            break;

             case 3:System.out.println("Wednesay");
            break;

             case 4:System.out.println("Thursday");
            break;

             case 5:System.out.println("Friday");
            break;

             case 6:System.out.println("Satday");
            break;

             case 7:System.out.println("Sunday");
            break;
            
            default:System.out.println("Invalid Input ! Please enter the week number  1-7");

            sc.close();
        }


    }

}
