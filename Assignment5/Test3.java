import java.util.Scanner;
class Account{
	int acno;
	float balance;
	Account (int a, float b) {
		acno=a;
		balance=b;
	}
	void withdraw(int w){
		balance-=w;
	}
	void deposit(int d){
		balance+=d;
	}
}
class Calculate extends Account{
	int r,t ;
	float si,amt;
	Calculate(int a, float b){
		super(a,b);
	}
	void accept(int x, int y){
		r=x;
		t=y;
		amt=0;
	}
	void compute(){
		si = (balance * r * t) / 100;
		amt+=si;
	}
	void display(){
		System.out.println("Account number: "+acno);
		System.out.println("Balance: "+balance);
		System.out.println("Interest: "+si);
		System.out.println("Amount: "+amt);
	}
}
class Test3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account number: ");
		int a = sc.nextInt();
		System.out.println("Enter the balance: ");
		float b= sc.nextFloat();
		Calculate c1 = new Calculate(a,b);
		System.out.println("Enter the rate of interest: ");
		int x= sc.nextInt();
		System.out.println("Enter the time: ");
		int y = sc.nextInt();
		c1.accept(x,y);
		c1.compute();
		c1.display();
		sc.close();
	}
}
