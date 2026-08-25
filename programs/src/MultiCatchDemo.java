
public class MultiCatchDemo {

	public static void main(String[] args) {
		try 
		{
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			int res = n1 / n2;
			System.out.println("Result = "+res);
		}
		catch(ArithmeticException e) {
			System.err.println("Divide by zero not allowed");//10 0
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Require two Numbers"); //10
		}
		catch(NumberFormatException e) {
			System.err.println("Enter only numbers"); //a b , 10 a, a 10
		}
		catch(RuntimeException e) {
			System.err.println("Runtime Exception"); 
		}
		catch(Exception e) {
			System.err.println("Exception occured");
		}
	}

}
