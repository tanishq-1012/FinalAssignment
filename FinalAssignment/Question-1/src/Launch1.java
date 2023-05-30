/*Question-1 Write a Java program that uses polymorphism by defining an interface called Shape
with methods to calculate the area and perimeter of a shape. Then create classes
that implement the Shape interface for different types of shapes, such as circles and
triangles.
*/

interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

class Circle implements Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double calculateArea() {
        return Math.PI * r * r;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * r;
    }
}

class Triangle implements Shape {
    private double s1;
    private double s2;
    private double s3;

    public Triangle(double s1, double s2, double s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    public double calculateArea() {
        double s = (s1 + s2 + s3) / 2;
        return Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
    }

    @Override
    public double calculatePerimeter() {
        return s1 + s2 + s3;
    }
}


public class Launch1 {
	 public static void main(String[] args) {
	        Shape circle = new Circle(5.0);  //Loose Coupling
	        System.out.println("Area of Circle is : " + circle.calculateArea());
	        System.out.println("Perimeter of a Circle is : " + circle.calculatePerimeter());
	        System.out.println("************************************************");
	        System.out.println("************************************************");
	        Shape triangle = new Triangle(3.0, 4.0, 5.0);  //Loose coupling
	        System.out.println("Area of Trinangle is : " + triangle.calculateArea());
	        System.out.println("Perimeter of Trinangle is : " + triangle.calculatePerimeter());
	    }

}
