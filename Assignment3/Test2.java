import java.util.Scanner;

class Stock{
	static Stock[] collection  = new Stock[10];
	String name,author,pub;
	int noc;
	static int counter=0;
	Stock(String name, String author, String pub ,int noc){
		this.name=name;
		this.author=author;
		this.pub=pub;
		this.noc=noc;
		insert();
	}
	void insert(){
		if (counter==9){
			System.out.println("Collection full");
		}
		else if (counter<10){
			collection[counter]=this;
			counter++;
		}
		else{
			System.out.println("Could not accept this book");
		}
	}
	void purchase(String name, String author, String pub ,int noc){
		int i;
		boolean flag=false;
		for(i =0;i<10;i++){
			Stock c=collection[i];
			if (c.name== name && c.author==author && c.pub==pub ){
				flag=true;
				break;
			}
		}
		if (flag==true){
			Stock c=collection[i];
			if (c.noc>0 && c.noc>noc){
					c.noc-=noc;
					System.out.println("Purchase Successful");
			}
			else{
				System.out.println("Book Not Available");
			}
		}
			
	}
	

}

public class Test2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String name, author, pub;
		int noc;
		System.out.println("Enter the title of book: ");
		name = sc.nextLine();
		System.out.println("Enter the autho: ");
		author = sc.nextLine();
		System.out.println("Enter the publisher: ");
		pub = sc.nextLine();
		System.out.println("Enter the noc: ");
		noc= sc.nextInt();
		Stock s1= new Stock(name,author,pub,noc);
		System.out.println("Enter the number of copiesyou want: ");
		int n_=sc.nextInt();
		s1.purchase(name,author,pub, n_);
		sc.close();
	}
}
