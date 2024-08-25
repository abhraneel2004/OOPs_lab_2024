
class Animal{
	int legs;
	int eyes;
	boolean alive;
	Animal(int l, int e, boolean a){
		legs=l;
		eyes=e;
		alive=a;
	}
	void movement(){
		System.out.println("I can move");
	}
}
class Carnivore extends Animal{
	String diet;
	Carnivore(int l, int e, boolean a, String d){
		super(l,e,a);
		diet=d;
	}
	void showDiet(){
		System.out.println("I eat "+diet);
	}
	void movement(){
		System.out.println("I can run");
	}
}
class Lion extends Carnivore{
	String loc;
	String name;
	Lion(int l, int e, boolean a, String d, String loc, String name){
		super(l,e,a,d);
		this.loc=loc;
		this.name=name;
	}
	void greeting(){
		System.out.println("I am "+name+", the King of Jungle");
	}
	void movement(){
		System.out.println("I can hunt in "+loc);
	}
}

public class Test4{
	public static void main(String[] args){
		Lion l1 = new Lion(4, 2,true, "meat", "Africa", "Mufasa");
		l1.greeting();
		l1.showDiet();
		l1.movement();
	}
}
