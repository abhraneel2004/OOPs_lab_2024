import java.util.Scanner;

class Library{
	String name;
	int price, day;
	double fine;
	void input(String name, int price, int day){
		this.name=name;
		this.price=price;
		this.day=day;
	}
	
	void cal(){
		if (day<=7){
			fine= 0.25*day;
		}
		else if(day>7 && day<= 15){
			fine= 1.75+ 0.4* (day-7);
		}
		else if (day>15 && day<=30){
			fine = 4.95+ 0.6*(day-15);
		}
		else{
			fine= 13.95+ 0.8*(day-30);
		}
	}
	
	void display(){
		System.out.println("Name of the book: "+ name);
		System.out.println("Fine to be paid: "+ fine);
	}

}

public class Test1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nameof the book: ");
		String name=sc.nextLine();		
		System.out.println("Enter the price: ");
		int price= sc.nextInt();
		System.out.println("Enter the Days exceeded: ");
		int day = sc.nextInt();
		
		Library l1= new Library();
		l1.input(name, price, day);
		l1.cal();
		l1.display();
		sc.close();
	}
}
