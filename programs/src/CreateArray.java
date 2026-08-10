import java.util.Scanner;
public class CreateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size:");
		int s=sc.nextInt();
		int Arr[]=new int[s];
		for(int i=0;i<Arr.length;i++){
			System.out.println("Arr["+i+"]:");
			Arr[i]=sc.nextInt();
		}
		for(int c:Arr) {
			System.out.print(c+" ");
		}

	}

}
