import java.util.Scanner;

class Discount{
	int cost;
	String name;
	double dc;
	double amt;
	void input(String name, int cost){
		this.name=name;
		this.cost=cost;
	}
	
	void cal(){
		if (cost<=5000){
            dc = 0;
        }
        else if (cost>5000 && cost<=10000){
            dc = 0.1*cost;
        }
        else if (cost>10000 && cost<=15000){
            dc = 0.15*cost;
        }
        else{
            dc = 0.2*cost;
        }
        amt = cost - dc;
	}
	
	void display(){
		System.out.println("Name of the customer: "+name);
		System.out.println("Discout: "+dc);
		System.out.println("Amount to be paid: "+amt);
	}
	
}

public class Test4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name = sc.nextLine();
		System.out.println("Enter the cost of item: ");
		int cost = sc.nextInt();
		Discount d1 = new Discount();
		d1.input(name, cost);
		d1.cal();
		d1.display();
		sc.close();
	}

}
