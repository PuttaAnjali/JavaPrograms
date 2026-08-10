import java.util.Scanner;
public class circleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius:");
		double r=sc.nextDouble();
		double area=Math.PI*r*r;
		area=(3.14*r*r);
		System.out.println("Area:" +area);

	}

}
