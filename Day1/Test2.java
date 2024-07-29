
class GCD{
    static int res;
    public static void gcdcalc(int a, int b){
        int t;
        if (a>b){
            t=b;
        }
        else{
            t=a;
        }
        
        for(int i = 1; i<=t; i++){
            if (a%i==0 && b%i==0){
                res = i;
            }
        }
        System.out.println("GCD of " + a + " and " + b + " is " + res);
    }
}

public class Test2 {
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
            GCD.gcdcalc(l, u);
                
        }
        else{
            System.out.println("Invalid data");
        }
    }
}
