import java.util.*;

public class area {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();

        float area = 3.14f * radius * radius;

        System.out.println("The area of circle is " + area);

        sc.close();
    }
}
