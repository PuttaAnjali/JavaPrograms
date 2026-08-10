import java.util.Scanner;
public class BigN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,big=0;
		for(int i=0;i<10;i++) {
			System.out.println("enter "+(i+1)+" st/rd/th Number: ");
			n=sc.nextInt();
			if(big<n) {
			big=n;
			}
		}
		System.out.println("big: "+big);


	}

}
