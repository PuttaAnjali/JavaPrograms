interface Shape3{
	//void display() {
		//System.out.println("Shape base class");
	//}
	double area();      
}

class Rectangle4 implements Shape3{
	double l,b;
	Rectangle4(double l,double b){
		this.l = l;
		this.b = b;
	}
	public double area() {
		return l*b;
	}
}
class Circle4 implements Shape3{
	double r;
	Circle4(double r){
		this.r = r;
	}
	public double area() {
		return Math.PI*r*r;
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		Shape3 s;
		s = new Rectangle4(12,5);
		System.out.println("Area of Rectangle: "+s.area());
	    s = new Circle4(12.5);
		System.out.println("Area of Circle: "+s.area());
	}

}