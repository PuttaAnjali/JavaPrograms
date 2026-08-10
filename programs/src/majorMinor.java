import java.util.Scanner;
public class majorMinor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("enter age:");
			int age=sc.nextInt();
			if(age>=0) {
				if(age>=18) {
					System.out.println("Major");
					
				}else {

		System.out.println("Minor");
				}
			}else {
				System.out.println("Invalid age[]");
			}
		}

	}

