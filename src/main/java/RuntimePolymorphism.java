/**
 *
 */


/**
 * @author hp
 */

abstract class Shapes {
	abstract void area();
}

class Triangles extends Shapes {
	public int base, height;

	public Triangles(int base, int height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public void area() {
		System.out.println("Area of Triangle: " + (1.0 / 2 * base * height));
	}
}

class Squares extends Shapes {
	public int length;

	public Squares(int length) {
		this.length = length;
	}

	@Override
	public void area() {
		System.out.println("Area of Square: " + (Math.pow(length, 2)));
	}
}

class Rectangles extends Shapes {
	public int length, breadth;

	public Rectangles(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void area() {
		System.out.println("Area of Rectangle: " + (length * breadth));
	}
}

public class RuntimePolymorphism {
	public static void main(String[] args) {
		Shapes triangle = new Triangles(10, 5);
		Shapes square = new Squares(10);
		Shapes rectangle = new Rectangles(10, 3);

		triangle.area();
		square.area();
		rectangle.area();

	}
}
