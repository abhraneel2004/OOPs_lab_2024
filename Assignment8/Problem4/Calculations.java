import mathcal.FactGCD;
import mathcal.mathcheck.Prime;
import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FactGCD fg = new FactGCD();
        Prime p = new Prime();
        
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Factorial of "+ n + ": " + fg.calFactorial(n));

        System.out.println("Enter a number 1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter a number 2: ");
        int n2 = sc.nextInt();
        
        System.out.println("GCD of "+n1+" and "+n2+": " + fg.calGCD(n1, n2));

        System.out.println("Enter a number: ");
        n = sc.nextInt();
        System.out.println("Is "+ n+" a prime number? " + p.isPrime(n));
    }
}
