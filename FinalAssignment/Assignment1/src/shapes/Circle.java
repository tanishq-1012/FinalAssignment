package shapes;

public class Circle implements Shape {
	
	float radius;
	
	public Circle(float radius) {
		this.radius = radius;
	}

	@Override
	public float calculatePerimeter() {
		return 2*3.14f*radius;
	}

	@Override
	public float calculateArea() {
		return 3.14f*radius*radius;
	}

}
