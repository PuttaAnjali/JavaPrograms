import java.util.Scanner;
public class BigSmallArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter array size:");
		int s=sc.nextInt();
		int Arr[]=new int[s];
		int big=Integer.MIN_VALUE;
		int secondBig=Integer.MIN_VALUE;
		int small=Integer.MAX_VALUE;
		int secondSmall=Integer.MAX_VALUE;
		for(int i=0;i<s;i++){
			System.out.print("Arr["+i+"]: ");
			Arr[i]=sc.nextInt();
		}
		if(s>2) {
			for(int n:Arr) {
				if(n>big) {
					secondBig=big;
					big=n;
				}
				else if(n>secondBig && secondBig!=big) {
					secondBig=n;
				}
				if(n<small) {
					secondSmall=small;
					small=n;
				}
				else if(n<secondSmall && secondSmall!=small) {
					secondSmall=n;
				}
			    }
			System.out.print("Big: "+big+" second Big: "+secondBig);
			System.out.print(" Small: "+small+" second Small: "+secondSmall);
	     }
		else {
			System.out.println("2 element array not possible");
		}
	}
}
