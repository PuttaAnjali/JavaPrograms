import java.util.Scanner;

public class SumUntilZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,sum=0;
		for(;;) {
			System.out.println("enter Numbers:");
			n=sc.nextInt();
			if(n==0) break;
				sum=sum+n;
			}
			System.out.println("sum: "+sum);	
	}

}
