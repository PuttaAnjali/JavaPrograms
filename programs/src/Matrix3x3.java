import java.util.Scanner;
public class Matrix3x3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter row size:");
		int r=sc.nextInt();
		System.out.print("enter column size:");
		int c=sc.nextInt();
		int mat[][]=new int[r][c];
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print("mat["+i+"]["+j+"]:");
				mat[i][j]=sc.nextInt();
				
			}
		}
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(mat[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
