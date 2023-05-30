package shapes;

public class Square implements Shape {

	float side;
	
	public Square(float side) {
		this.side = side;
	}

	@Override
	public float calculatePerimeter() {
		return 4*side;
	}

	@Override
	public float calculateArea() {
		return side*side;
	}
	
}
