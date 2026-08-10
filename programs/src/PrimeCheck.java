import java.util.Scanner;

public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a numbers:");
		int n = sc.nextInt();
		int f=0;
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {
				f=1;
				break;
			}
		}
		if(f==1)
			System.out.println("Not a prime");
		else
			System.out.println("prime");
	}

}
