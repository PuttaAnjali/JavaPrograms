class Outer{
	int m=100;
	class Inner{
		void doStuff() {
			System.out.println("m = "+m);
		}
	}
}
public class InnerDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Inner innerObj=new Outer().new Inner();
		innerObj.doStuff();
	}
}
