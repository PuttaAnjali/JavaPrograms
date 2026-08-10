import java.util.Scanner;
public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a character: ");
		char ch=sc.nextLine().charAt(0);
		switch(ch){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("vowel ");break;
		default:System.out.println("consonent ");break;
			
		}

	}

}
