class Series1 {
    private static int factorial(int x) {
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact = fact * i;
        }
        return fact;
    }

    static double summation(int x, int n) {
        double s = 0.0;
        for (int i = 1; i <= n; i++) {
            int k = factorial(2 * i);
            s +=((double) Math.pow(x, 2 * i)/k);
        }
        return s;
    }
}

public class Test5 {
    static int validData(String a) {
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) < '0' || a.charAt(i) > '9') {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        if (validData(args[0]) == 1 && validData(args[1]) == 1) {
            int x = Integer.parseInt(args[0]);
            int n = Integer.parseInt(args[1]);
            System.out.println("x = " + x);
            System.out.println("n = " + n);
            double sum = Series1.summation(x, n);
            System.out.println("Sum = " + sum);
        } else {
            System.out.println("Invalid data");
        }
    }
}
