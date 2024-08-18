import java.util.Scanner;
class Distance{
	int km;
	int m;
	int cm;
	Distance(){}
	Distance(int km, int m, int cm){
		this.km= km;
		this.m=m;
		this.cm= cm;
	}
	Distance(Distance d1){
		this.km= d1.km;
		this.m = d1.m;
		this.cm = d1.cm;
	}
	void addDistance(Distance d1){
		int temp= this.cm + d1.cm;;
		this.cm= temp%100;
		temp = this.m+d1.m + temp/100;
		this.m = temp%1000;
		this.km = this.km+ d1.km+ temp/1000;
	}

	void addDistance(Distance d1, Distance d2){	
		int temp= d1.cm + d2.cm;;
		this.cm= temp%100;
		temp = d2.m+d1.m + temp/100;
		this.m = temp%1000;
		this.km = d2.km+ d1.km+ temp/1000;
	}
}

public class Test2{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("For d1 enter km: ");
		int km1 = sc.nextInt();
		System.out.println("For d1 enter m: ");
		int m1 = sc.nextInt();
		System.out.println("For d1 enter cm: ");
		int cm1 = sc.nextInt();
		Distance d1 = new Distance(km1, m1, cm1);
		System.out.println("For d2 enter km: ");
		int km2 = sc.nextInt();
		System.out.println("For d2 enter m: ");
		int m2 = sc.nextInt();
		System.out.println("For d2 enter cm: ");
		int cm2 = sc.nextInt();
		Distance d2 = new Distance(km2, m2, cm2);
		Distance d3 = new Distance();
		d3.addDistance(d1, d2);
		System.out.println("Result: ");
		System.out.println("km = "+d3.km);
		System.out.println("m = "+d3.m);
		System.out.println("cm = "+d3.cm);
		sc.close();
	}
}
