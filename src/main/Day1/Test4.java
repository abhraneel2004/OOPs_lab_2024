
class Fibo{
    static void fibonacci(int n){
        int a = 0, b = 1, c;
        System.out.print(a + " " + b + " ");
        for(int i = 2; i<n; i++){
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}

public class Test4 {
    static int validData(String a){
        for(int i = 0; i<a.length(); i++){
            if (a.charAt(i)<'0' || a.charAt(i)>'9'){
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args){
        if (validData(args[0])==1){
            Fibo.fibonacci(Integer.parseInt(args[0]));
        }
        else{
            System.out.println("Invalid Input");
        }
    }
}
