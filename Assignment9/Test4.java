class InvalidAgeException extends Exception{
    InvalidAgeException(String s){
        super(s);
    }
}

class MinBalanceException extends Exception{
    MinBalanceException(String s){
        super(s);
    }
}
public class Test4 {
    public static void main(String[] args)throws InvalidAgeException, MinBalanceException{
        int age= Integer.parseInt(args[0]);
        int balance= Integer.parseInt(args[1]);
        if (age<18){
            throw new IllegalArgumentException("Not eligible to vote");
        }else{
            System.out.println("You can Vote"); 
        }
        if (balance<5000){
            throw new MinBalanceException("Account should have minimum Rs.5000/-");
        }else{
            System.out.println("minimum balance maintained");;
        }
    }
}
