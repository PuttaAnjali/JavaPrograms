class Car{
	String brand;
	String colour;
	int speed;
	void drive() {
		System.out.println(brand+" car driving");
	}
}
public class CarDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1=new Car();
		car1.brand="BMW";
		System.out.println(car1.brand);
		car1.drive();
	}

}
