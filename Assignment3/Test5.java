import java.util.Scanner;

class Mobike{
	String name;
	int bno, phno, days, charge;
	void input(String name, int bno, int phno, int days){
		this.name=name;
		this.bno=bno;
		this.phno=phno;
		this.days=days;
	}
	
	void compute(){
		if (days<=5){
			charge= 500*days;
		}
		else if(days>5 && days<= 10){
			charge= 2500+ 400* (days-5);
		}
		else{
			charge= 4500+ 200*(days-10);
		}
	}
	
	void display(){
		System.out.println("Bike number: "+ bno);
		System.out.println("Phone number: "+ phno);
		System.out.println("Name: "+ name);
		System.out.println("No. of Days: "+ days);
		System.out.println("Charge: "+ charge);
	}

}

public class Test5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter bike number: ");
		int bno=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name: ");
		String name=sc.nextLine();		
		System.out.println("Enter the Phone number: ");
		int phno= sc.nextInt();
		System.out.println("Enter the Days: ");
		int day = sc.nextInt();
		Mobike m1= new Mobike();
		m1.input(name,bno,phno,day);
		m1.compute();
		m1.display();
		sc.close();
	}
}
