public class ExpDemo {
	public static void main(String[] args) {
		int a=200,b=5,c=0;
		System.out.println("Exception Demo");
		try {
			c=a/b;
			}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	System.out.println("Result: "+c);
	}	

}
