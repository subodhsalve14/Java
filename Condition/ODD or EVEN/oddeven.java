import java.util.*;

public class oddeven {

    public static void main(String args[]) {

        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number% 2==0){
            System.out.println("EVEN");
        }else{
            System.out.println("ODD");
        }

        sc.close();
    }
}
