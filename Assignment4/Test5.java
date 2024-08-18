import java.util.Scanner;
import java.lang.*;
class Population{
	float p;
	float r;
	Population(float p, float r){
		this.p=p;
		this.r=r;
	}
	void print(){
		for(int i=2001; i<=2007; i++){
			p=p*(1+r/100);
			System.out.println("Population on "+i+"is:   "+p);
		}
	}
}

public class Test5{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the population at the end of 2000: ");
		float p = sc.nextFloat();
		System.out.println("Enter the rate of growth: ");
		float r = sc.nextFloat();
		Population p1 = new Population(p,r);
		p1.print();
		sc.close();
	}
	
}
