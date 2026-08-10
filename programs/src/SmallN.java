import java.util.Scanner;

public class SmallN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n,small=1200;
		for(int i=0;i<10;i++) {
			System.out.println("enter "+(i+1)+" st/rd/th Number: ");
			n=sc.nextInt();
			if(n<small) {
			small=n;
			}
		}
		System.out.println("small: "+small);

	}

}
