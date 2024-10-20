import java.util.Scanner;
import calculation.Operations;

public class TwoOperations {
    public static void main(String[] args){
        Operations op = new Operations();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum of two integers: " + op.sum(a, b));
        System.out.println("Product of two integers: " + op.multiply(a, b));

        System.out.println("Enter two doubles: ");
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        System.out.println("Sum of two doubles: " + op.sum(c, d));
        System.out.println("Product of two doubles: " + op.multiply(c, d));

        System.out.println("Enter two floats: ");
        float e = sc.nextFloat();
        float f = sc.nextFloat();
        System.out.println("Sum of two floats: " + op.sum(e, f));
        System.out.println("Product of two floats: " + op.multiply(e, f));

        sc.close();
    }
}
