import java.util.Scanner;

//1.century (100%=0 and 400%=0) 2000,2400,2800  not-1700,1800,1900
// 2.yearly (100!=0 and 4%=0) 2020,2024 not-2021 2022 2023
public class question5 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year  : ");
        int year = sc.nextInt();

    if((year %100==0 && year %400==0) || (year%100!=0 && year %4==0 )){
        System.out.println("Leaf Year");
    }else{
        System.out.println("Not Leaf Year");
    }


        sc.close();
    }
}
