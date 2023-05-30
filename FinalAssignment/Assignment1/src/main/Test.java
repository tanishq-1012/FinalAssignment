package main;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;
import shapes.Square;
import shapes.Triangle;

public class Test {
	
	static Shape shape;
	
	public static void main(String[] args) {
		
		//area of Rectangle
		shape = new Rectangle(5.5f, 3f);
		System.out.println("=========Rectangle=======");
		System.out.println("Perimeter Of Rectangle= "+shape.calculatePerimeter());
		System.out.println("Area Of Rectangle= "+shape.calculateArea()+"\n");
		//area of Square
		
		shape = new Square(6);
		System.out.println("=========Square=======");
		System.out.println("Perimeter Of Square= "+shape.calculatePerimeter());
		System.out.println("Area Of Square= "+shape.calculateArea()+"\n");
		//area of Triangle
		
		shape = new Triangle(4.4f, 5, 7.1f);
		System.out.println("=========Triangle=======");
		System.out.println("Perimeter Of Triangle= "+shape.calculatePerimeter());
		System.out.println("Area Of Triangle= "+shape.calculateArea()+"\n");
		//area of Circle
		
		shape = new Circle(5);
		System.out.println("=========Circle=======");
		System.out.println("Perimeter Of Circle= "+shape.calculatePerimeter());
		System.out.println("Area Of Circle= "+shape.calculateArea()+"\n");
	}

}
