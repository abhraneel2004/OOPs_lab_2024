class Rectangle{
	private double length;
	private double breadth;
	private float area;
	private float perimeter;
	void inputData( double length, double breadth){
		this.length = length;
		this.breadth = breadth;
	}
	float calculateArea(){
		area = (float)(length*breadth);
		return area;
	}
	float calculatePerimeter(){
		perimeter = (float)(2*(length+breadth));
		return perimeter;
	}
	void outputData(){
		System.out.println("Area of the rectangle: "+area);
		System.out.println("Perimeter of the rectangle: "+ perimeter);
	}
}

public class Test1{
	static int validData(String a){
		for(int i = 0; i< a.length(); i++){
			if (a.charAt(i) < '0' || a.charAt(i) > '9') return 0;
		}
		return 1;
	}
	
	public static void main(String[] args){
		if (validData(args[0]) == 1 && validData(args[1])==1){
			int length = Integer.parseInt(args[0]);
			int breadth = Integer.parseInt(args[1]);
			Rectangle r1 = new Rectangle();
			r1.inputData(length, breadth);
			r1.calculateArea();
			r1.calculatePerimeter();
			r1.outputData();
		}
		else{
			System.out.println("Invalid Input");
		}
	}

}
