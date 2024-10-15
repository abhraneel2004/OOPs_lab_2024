import java.util.Scanner;
public class Test2{

    public static boolean isHappy(String s){
        int val = 0;
        for(char c: s.toCharArray()){
            int t = (int)c-64;
            String temp = String.valueOf(val)+String.valueOf(t);
            val = Integer.parseInt(temp);
        }
        
        int temp = val;
        int ctemp, rem, sum;
        while(temp>=10){
            ctemp = temp;
            sum=0;
            while(ctemp>0){
                rem = ctemp%10;
                sum+=(rem*rem);
                ctemp/=10;
            }
            temp = sum;
        }
        return temp==1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String s = sc.next().toUpperCase();
        if (isHappy(s)){
            System.out.println("Happy!");
        }
        else{
            System.out.println("Not happy");
        }
        sc.close();
    }
}