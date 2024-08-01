import java.util.Scanner;

class Employee{
	int pan;
	String name;
	double taxincome;
	double tax;
	void input(int pan,String name, double taxincome){
		this.pan=pan;
		this.name=name;
		this.taxincome=taxincome;
	}
	
	void cal(){
		if (this.taxincome <=250000){
			this.tax=0;
		}
		else if(this.taxincome > 250000 && this.taxincome <= 500000){
			this.tax= 0.1*(taxincome-250000);
		}
		else if(this.taxincome > 500000 && this.taxincome <=1000000){
			this.tax=30000+(0.2*(taxincome-500000));
		}
		else{
			this.tax=50000+(0.3*(taxincome-100000));
		}
	}
	
	void display(){
		System.out.println("Pan Number: "+pan);
		System.out.println("Name: "+name);
		System.out.println("Taxable Income: "+taxincome);
		System.out.println("Tax: "+tax);
	}
	
}

public class Test3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name = sc.nextLine();
		System.out.println("Enter the pan number(int): ");
		int pan = sc.nextInt();
		System.out.println("Enter the taxable income: ");
		double taxincome = sc.nextDouble();
		Employee emp = new Employee();
		emp.input(pan, name, taxincome);
		emp.cal();
		emp.display();
		sc.close();
	}

}
