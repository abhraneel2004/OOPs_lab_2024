
import mypack.Shape;

import java.util.Scanner;

public class Figure {
    public static void main(String[] args) {
        Shape s = new Shape();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length and breadth of the rectangle: ");
        double length = sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle: ");
        double breadth = sc.nextDouble();
        System.out.println("Recatangle Area: " + s.getArea(length, breadth));

        System.out.println("Enter the side of Square: ");
        double side = sc.nextDouble();
        System.out.println("Square Area: " + s.getArea(side, side));

        System.out.println("Enter the radius of the circle: ");
        double rad = sc.nextDouble();
        System.out.println("Circle Area: " + s.getArea(rad));

        sc.close();
    }
}
