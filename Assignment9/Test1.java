import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 10;
        int b;
        try {
            System.out.println("a = " + a);
            System.out.print("Enter b: ");
            b = sc.nextInt();
            System.out.println("division: " + (a / b));
            try {
                int arr[] = new int[3];
                arr[4] = 100;
            } catch (ArrayIndexOutOfBoundsException aioobe) {
                aioobe.printStackTrace();
            }
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        sc.close();
    }
}
