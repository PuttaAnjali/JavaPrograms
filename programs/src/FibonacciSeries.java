import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of terms:");
		int n = sc.nextInt();
		int a=0,b=1;
		System.out.println("fibonacci series:");
		for(int i=1;i<=n;i++) {
			System.out.println(a+ "  ");
			int c=a+b;
			a=b;
			b=c;
			
		}

	}

}
