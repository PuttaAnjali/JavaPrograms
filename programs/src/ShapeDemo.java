class Shape{
	void draw() {
		System.out.println("Drawing Shape");
	}
}
class circle3 extends Shape{
	void draw() {
		System.out.println("Drawing Circle");
	}
}
class Rectangle1 extends Shape{
	void draw() {
		System.out.println("Drawing Rectangle1");
    }
}
class Triangle extends Shape{
	void draw() {
		System.out.println("Drawing Triangle");
	}
}
public class ShapeDemo {
	public static void main(String[] args) {
		Shape[] shape= {new circle3(),new Rectangle1(),new Triangle()};
		for(Shape s: shape) {
			s.draw();
		}
	}

}
