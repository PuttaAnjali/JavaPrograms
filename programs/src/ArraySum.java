import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter array size:");
		int s=sc.nextInt();
		int sum=0;
		int Arr[]=new int[s];
		for(int i=0;i<Arr.length;i++){
			System.out.print("Arr["+i+"]:");
			Arr[i]=sc.nextInt();
		}
		for(int c:Arr) {
			System.out.print(c+" ");
			sum+=c;
	  }
	  System.out.print("\nSum of array elements: "+sum);
		
	}
}
