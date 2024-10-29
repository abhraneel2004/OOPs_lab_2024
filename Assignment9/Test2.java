import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 10;
        int b;
        try {
            System.out.println("a = " + a);
            System.out.print("Enter b: ");
            b = sc.nextInt();
            System.out.println("division: " + (a / b));
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
        } finally {
            System.out.println("Inside finally block");
            sc.close();
        }
    }
}
