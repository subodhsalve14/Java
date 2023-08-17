import java.util.*;

public class side {
    public static void main (String args[]){

        Scanner sc =new Scanner(System.in);
          System.out.print("Enter the side : ");
        int side = sc.nextInt();
 
        int area =side *side ;

        System.out.println("The side of square is : " + area);

        sc.close();
    }
}
