abstract class shape{
	void display() {
		System.out.println("Shape base class");
	}
	abstract double area();
}
class Rectan extends shape{
	double l,b;
	Rectan(double l, double b){
		this.l = l;
		this.b = b;
	}
	double area() {
		return l*b;
	}
}
class Circle extends shape{
	double r;
	Circle(double r){
		this.r = r;
	}
	double area() {
		return Math.PI*r*r;
	}
}
public class AbstractClassDemo {
	public static void main(String[] args) {
		Rectan r = new Rectan(12,5);
		System.out.println("Area of Rectangel: "+r.area());
		Circle c = new Circle(12.5);
		System.out.println("Area of Circle: "+c.area());
	}

}