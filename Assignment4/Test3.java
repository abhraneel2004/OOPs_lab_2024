import java.util.Scanner;

class Laptop{
	String name;
	int price;
	double dis;
	double amt;
	Laptop(String name, int price){
		this.name =name;
		this.price = price;
		if (price<= 25000){
			this.dis=5.0/100;
		}
		else if(price>25000 && price<=50000)
			this.dis=7.5/100;
		else if(price>50000 && price<=100000)
			this.dis=10.0/100;
		else
			this.dis=15.0/100;
	}
	void calDis(){
		this.amt=(1-this.dis)*this.price;
	}
	void display(){
		System.out.println("Customer name: "+this.name);
		System.out.println("Amount to be paid: "+this.amt);
	}

}
public class Test3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of Customer: ");
		String name = sc.nextLine();
		System.out.println("Enter the laptop price: :");
		int price= sc.nextInt();
		Laptop l1= new Laptop(name, price);
		l1.calDis();
		l1.display();
		sc.close();
	}
}
