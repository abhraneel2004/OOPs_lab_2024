/*
 A string is said to be ‘Unique’ if none of the letters present in the string are repeated. Write a program to accept 
a string and check whether the string is Unique or not. The program displays a message accordingly.
Sample Input: COMPUTER
Sample Output: Unique String
 */

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args){
        int arr[] = new int[26];
        int val;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String s = sc.next();
        s = s.toLowerCase();
        char[] c = s.toCharArray();
        for(char c1: c){
            val = (int)c1 - 97;
            if (arr[val]==0){
                arr[val]++;
            }
            else{
                System.out.println("Not unique");
                System.exit(1);
            }
        }
        System.out.println("Unique: ");
    }
}
