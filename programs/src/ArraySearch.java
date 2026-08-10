import java.util.Scanner;

public class ArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter array size:");
		int s=sc.nextInt();
		int K,f=-1;
		int Arr[]=new int[s];
		for(int i=0;i<Arr.length;i++){
			System.out.print("Arr["+i+"]:");
			Arr[i]=sc.nextInt();
		}
		System.out.print("Enter element to search! ");
		K=sc.nextInt();
		for(int i=0;i<Arr.length;i++) {
			if(K==Arr[i]) {
				f=i;
				break;
			}
		}
		if(f>=0) {
			System.out.println(K+" founded at index "+f);
	  }
		else {
			System.out.println(K+" not found");
		}
	}

}
