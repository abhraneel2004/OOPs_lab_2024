package mathcal;

public class FactGCD {
    public int calFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calFactorial(n - 1);
    }

    public int calGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calGCD(b, a % b);
    }
}
