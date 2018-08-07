package circle;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle c1 = new Circle();
		System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea() + " and color "
				+ c1.getColor());

		Circle c2 = new Circle(2.0);
		System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea() + " and color "
				+ c2.getColor());

		Circle c3 = new Circle();
		c3.setRadius(3.0);
		c3.setColor("blue");

		System.out.println("The circle has radius of " + c3.getRadius() + " and area of " + c3.getArea() + " and color "
				+ c3.getColor());
		
		System.out.println(c2.toString()); // explicit call
		
		System.out.println("Operator '+' invokes toString() too: " + c2); // '+' invokes toString() too;

	}

}
