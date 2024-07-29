import java.lang.Math;

class Prime{
    private static boolean isPrime(int i){
        if (i<=1){
            return false;
        }
        for(int j = 2; j<=Math.sqrt(i); j++){
            if (i%j==0){
                return false;
            }
        }
        return true;
    }
    public static void primeRange(int l, int u){
        for(int i = l; i<=u; i++){
            if (isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}

public class Test3 {
    static int validData(String a){
        for(int i = 0; i<a.length(); i++){
            if (a.charAt(i)<'0' || a.charAt(i)>'9'){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args){
        if (validData(args[0])==1 && validData(args[1])==1){
            System.out.println("Lower bound: " + args[0]);
            System.out.println("Upper bound: " + args[1]);
            int l = Integer.parseInt(args[0]);
            int u = Integer.parseInt(args[1]);
            Prime.primeRange(l, u);    
        }
        else{
            System.out.println("Invalid data");
        }
    }
}
