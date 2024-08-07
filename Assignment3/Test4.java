import java.util.Scanner;

class Honda{
	int type,cost;
	double newCost;
	void getType(int type,int cost){
		this.type=type;
		this.cost=cost;
	}
	void find(){
		if (type==2){
			newCost=1.10*cost;
		}
		else if (type==4){
			newCost=1.12*cost;
		}
		
		
	}
	
	void printCost(){
		System.out.println("New Cost : "+newCost);
	}

}

public class Test4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the type: ");
		int type= sc.nextInt();
		if (type==2 || type==4){
			System.out.println("Enter the cost: ");
			int cost= sc.nextInt();
			Honda h1 = new Honda();
			h1.getType(type,cost);
			h1.find();
			h1.printCost();
		}
		
		sc.close();
	}
}
