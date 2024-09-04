interface Figure{
	int getArea();
}
class Rectangle implements Figure{
	int l,b;
	Rectangle(int length, int breadth){
		l=length;
		b=breadth;
	}
	public int getArea(){
		return l*b;
	}
}
class Triangle implements Figure{
	int b,h;
	Triangle(int base, int height){
		b = base;
		h = height;
	}
	public int getArea(){
		return b*h/2;
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