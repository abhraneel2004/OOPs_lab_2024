import java.util.Scanner;
class Test1{
	int price;
	double amt;
	void setPrice(int price){
		this.price = price;
	}
	void Discount(int a){
		amt= (1-((double)a/100))*price;
	}
	void Discount(int a, int b){
		amt= (1-((double)a/100))*price;
		amt= (1-((double)b/100))*amt;
	}
	void Discount(int a, int b, int c){
		amt= (1-((double)a/100))*price;
		amt= (1-((double)b/100))*amt;
		amt= (1-((double)c/100))*amt;
	}
	
	public static void main(String[] args){
		Test1 t1= new Test1();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the price:");
		int p= sc.nextInt();
		t1.setPrice(p);
		int c;
		System.out.println("Enter no. of parameters(1/2/3): ");
		c= sc.nextInt();
		if (c==1){
			System.out.println("Enter the first discount: ");
			int d1=sc.nextInt();
			t1.Discount(d1);
			System.out.println("Amount to be paid: "+t1.amt);
		}
		else if (c==2){
			System.out.println("Enter the first discount: ");
			int d1=sc.nextInt();
			System.out.println("Enter the second discount: ");
			int d2=sc.nextInt();
			t1.Discount(d1,d2);
			System.out.println("Amount to be paid: "+t1.amt);
		}  
		else if (c==3){
			System.out.println("Enter the first discount: ");
			int d1=sc.nextInt();
			System.out.println("Enter the second discount: ");
			int d2=sc.nextInt();
			System.out.println("Enter the third discount: ");
			int d3=sc.nextInt();
			t1.Discount(d1,d2,d3);
			System.out.println("Amount to be paid: "+t1.amt);
		}  
		sc.close();
	}
}
