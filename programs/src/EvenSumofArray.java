import java.util.Scanner;

public class EvenSumofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter array size:");
		int n=sc.nextInt();
		int Arr[]=new int[n];
		for(int i=0;i<n;i++){
			Arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			if(Arr[i]%2==0) {
				sum+=Arr[i];
			}
	  }
	  System.out.print("Sum of Even elements = "+sum);
	}
}
