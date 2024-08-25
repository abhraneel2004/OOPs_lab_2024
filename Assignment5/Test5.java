//Write a java program to implement runtime polymorphism (e.g., Figure, Rectangle & Triangle).

class Figure{
	int d1;
	int d2;
	Figure(int d1, int d2){
		this.d1=d1;
		this.d2=d2;
	}
	int getArea(){
		return 0;
	}
}

class Rectangle extends Figure{
	Rectangle(int length, int breadth){
		super(length, breadth);
	}
	int getArea(){
		return d1*d2;
	}
}

class Triangle extends Figure{
	Triangle(int base, int height){
		super(base, height);
	}
	int getArea(){
		return d1*d2/2;
	}
}

public class Test5{
	public static void main(String[] args){
		Figure ref = new Rectangle(10,20);
		System.out.println("Rectangle area: "+ref.getArea());
		ref = new Triangle(10,20);
		System.out.println("Triangle area: "+ref.getArea());
	}

}
