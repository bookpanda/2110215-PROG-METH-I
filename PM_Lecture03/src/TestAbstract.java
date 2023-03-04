public class TestAbstract {
	public static void main(String[] args) {
		Shape c = new Circle(2, "Blue Circle");
		System.out.println(c.perimeter());
	}
}

//-----------------------------------
abstract class Shape {
	String name;

	// abstract double perimeter(){};
	abstract double perimeter();

	public String getName() {
		return this.name;
	}

	public String toString() {
		return this.getName() + "\n\tPerimeter = " + perimeter();
	}
}

class Triangle extends Shape {

	@Override
	double perimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

}

class Circle extends Shape {
	double radius;

	public Circle(double r, String n) {
		this.radius = r;
		this.name = n;
	}

	@Override
	double perimeter() {
		return 2 * Math.PI * this.radius;
	}

	double diameter() {
		return 2 * this.radius;
	}
}

class Square extends Shape {
	double height;

	public Square(double h, String n) {
		this.height = h;
		this.name = n;
	}

	@Override
	double perimeter() {
		return 4 * this.height;
	}
}
