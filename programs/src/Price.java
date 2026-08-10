import java.util.Scanner;
public class Price {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int options,itemNumber,quantity;
		double rate,price;
		String itemName;
		do {
			System.out.println("enter Item Number:");
			itemNumber=sc.nextInt();
			sc.nextLine();
			System.out.println("enter Item Name:");
			itemName=sc.nextLine();
			System.out.println("enter rate:");
			rate=sc.nextDouble();
			System.out.println("enter quantity:");
			quantity=sc.nextInt();
			price=rate*quantity;
			System.out.println("Item Number: "+itemNumber+" Name: "+itemName+" Rate: "+rate+ "Quantity: "+quantity);
			System.out.println("enter option");
			options=sc.nextInt();
		}while(options!=1);
		System.out.println("Thank you!");
	}

}
