import java.util.Scanner;
class Sale{
	String title, author, publication;
	double price;
	
	void input(String t, String a, String p, double pr){
		title=t;
		author=a;
		publication=p;
		price=pr;
	}
	void display(){
		System.out.println("\nTitle: "+title);
		System.out.println("Author: "+author);
		System.out.println("Publication: "+publication);
	}
}

class Purchase extends Sale{
	int noc,amount;
	Purchase(String t, String a, String p, double pr){
		input(t,a,p,pr);
	}
	void accept(int n){
		noc=n;
	}
	//— to enter the number of copies purchased
	void calculate( ){
		amount=noc*(int)price;
	}
//— to find the amount by multiplying number of copies ordered and price (i.e., noc * price)
	void show(){
		display();
		System.out.println("Noc : "+noc);
		System.out.println("Amount: "+amount);
	}
//— to display the elements describes in base class along with the number of copies purchased and amoun
}

public class Test2{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the Title: ");
		String t = sc.nextLine();
		sc.nextLine();
		System.out.print("Enter Author: ");
		String a = sc.nextLine();
		sc.nextLine();
		System.out.print("Enter the publication: ");
		String p = sc.nextLine();
		System.out.print("Enter the price: ");
		int pr = sc.nextInt();
		Purchase p1= new Purchase(t,a,p,pr);
		System.out.print("Enter the noc for purchase: ");
		int n= sc.nextInt();
		p1.accept(n);
		p1.calculate();
		p1.show();
		sc.close();
	}
}
