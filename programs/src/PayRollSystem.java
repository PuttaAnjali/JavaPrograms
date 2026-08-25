interface  payable{
	double calculatepay();
	void processpay();
}
class Employee2 implements payable {
	double salary;
	Employee2(double salary){ this.salary=salary;}
	@Override
	public double calculatepay() { return  salary / 12;}
	@Override
	public void processpay() {
		System.out.println("crediting Rs."+calculatepay() +"to account");
	}
	
}
class Freelancer implements payable{
	double hoursworked=hoursworked;
	this.hourlyrate=hourly
	
}
public class PayRollSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
