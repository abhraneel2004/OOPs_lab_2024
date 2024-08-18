import java.util.Scanner;
import java.lang.Math;

class Calculate{
	int num,f,rev;
	Calculate(int n){
		num=f=n;
		rev=0;
	}
	
	int prime(){
		if (num<=1) return 0;
		for(int i=2; i*i<=num; i++){
			if (num%i==0) return 0;
		}
		return 1;
	}
	
	int reverse(){
		rev=0;
		while(f>0){
			int rem=f%10;
			rev=10*rev+rem;
			f/=10;
		}
		f=num;
		return rev;
	}
	void display(){
		if (prime()==1){
			System.out.println("Prime");
		}
		if (num==reverse()){
			System.out.println("Palindrome");
		}
	}
}

public class Test4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		Calculate c1 = new Calculate(n);
		c1.display();
		sc.close();
	}
}
