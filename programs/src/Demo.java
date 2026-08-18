class E{
	int a=10,b=20;
	public String toString() {
		return a+" Class E " +b;
	}
}
public class Demo {
	public static void main(String[] args) {
		E a1=new E();
		E a2=new E();
		System.out.println(a1+" : "+a2);
	}
}
