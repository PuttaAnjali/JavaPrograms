import java.util.Scanner;

public class SumofNaturalNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		int sum=0;
		for(int i=1;i<n;i++) {
			sum = sum+i;
		}
		System.out.println("Sum=" +sum);
	}

}
