

public class largest3numbers {

    public static void main(String args[]) {

        int A = 100;
        int B = 20;
        int C = 30;

        if (A >= B && A >= C) {
            System.out.println(" A IS LARGEST");
        } else if (B >= C) {
            System.out.println("B IS THE LARGEST");
        } else {
            System.out.println("C IS THE LARGEST");
        }

    }
}