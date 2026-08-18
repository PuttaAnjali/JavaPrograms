abstract class Shape1 {
	String color="black";
	abstract double area();
	void display() {
		System.out.println("color: " +color);
	}
}
class circle1 extends Shape1 {
	double radius;
	circle1(double radius) {
		this.radius=radius;
	}
	@Override
	double area() {
		return Math.PI *radius*radius;
	}
}
public class Abstractlass_Example {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle1 c=new circle1(12.50);
		System.out.println("circle1 area: " +c.area());	
		c.display();
	}

}
