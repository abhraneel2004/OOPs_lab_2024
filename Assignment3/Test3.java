import java.util.Scanner;

class Loan{
	int time;
	double principle,rate,interest,amt;
	
	void getData(double principle, int time){
		this.principle=principle;
		this.time=time;
	}
	void calculate(){
		if (time<=5) this.rate=15;
		else if (time>5 && time<=10) this.rate=12;
		else this.rate=10;
		interest= (principle*rate*time)/100;
		amt=principle+interest;
	}
	
	void display(){
		System.out.println("Interest: "+interest);
		System.out.println("Amount: "+amt);
	}

}

public class Test3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle: ");
		double principle= sc.nextDouble();
		System.out.println("Enter the time: ");
		int time= sc.nextInt();
		Loan l1 = new Loan();
		l1.getData(principle, time);
		l1.calculate();
		l1.display();
		sc.close();
	}
}
