import java.util.Scanner;
public class Test6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String s = sc.next().toLowerCase();
        int[] arr = new int[26];
        String newWord = new String();
        for (int i = 0; i < s.length(); i++){
                if (arr[s.charAt(i)-'a']==0)
                    newWord= newWord+s.charAt(i);
                arr[s.charAt(i)-'a']++;
        }
        System.out.println("removing duplicate characters: "+newWord);
        for(int i=0; i<arr.length; i++){
            if (arr[i] >0){
                System.out.println("Frequency of "+ (char)(i+'a')+": "+arr[i]);
            }
        }
        sc.close();
    }
}
