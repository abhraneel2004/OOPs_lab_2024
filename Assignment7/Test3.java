import java.util.Scanner;
public class Test3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a word: ");
        String s = sc.next().toLowerCase();
        StringBuffer sb = new StringBuffer(s);
        if (s.charAt(0)==s.charAt(s.length()-1)){
            System.out.println("Special word");
        }
        else{
            System.out.println("Not special");
        }
        if (sb.equals(sb.reverse())){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
        sc.close();
        
    }
}
