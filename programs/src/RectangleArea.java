import java.util.Scanner;
class Rectangle{
	double length,breadth;
	Rectangle(double length,double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	double area() {
		return length*breadth;
	}
}
public class RectangleArea {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length & breadth:");
		double length=sc.nextDouble();
		double breadth=sc.nextDouble();
		Rectangle r=new Rectangle(length,breadth);
		System.out.println("Area of Rectangle:"+r.area());
		sc.close();
	}

}

