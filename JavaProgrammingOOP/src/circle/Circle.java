package circle;

public class Circle {

	private double radius;
	private String color;
	private double area;

	Circle() {
		radius = 1.0;
		color = "red";
	}

	Circle(double radius) {
		this.radius = radius;
		color = "red";
	}

	Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	double getRadius() {
		return radius;
	}

	double getArea() {

		return radius * radius * Math.PI;
	}

	String getColor() {
		return color;
	}

	void setRadius(double radius) {
		this.radius = radius;
	}

	void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return "[Circle: " + "radius= " + radius + " color= "+ color + "]";
	}
}
