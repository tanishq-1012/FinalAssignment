package shapes;

public class Triangle implements Shape {

	float s1;
	float s2;
	float s3;

	public Triangle(float s1, float s2, float s3) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}

	@Override
	public float calculatePerimeter() {
		return s1+s2+s3;
	}

	@Override
	public float calculateArea() {
		float s = this.calculatePerimeter()/2;
		return (float)Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
	}
}
