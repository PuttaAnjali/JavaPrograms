import java.io.IOException;
public class RunTimeExceptionDemo {
	public static void main(String[] args) throws IOException{
		//ArithmeticException
		         int n = 10/0;
		         //ArrayIndexOutofBoundsExceptioon
		         /*int[] n = {10,20,30,40,50};
		         System.out.println(n[8]);*/
		         //StringIndexOutofBoundsEXCEption
		         /*String s = "Hello";
		         System.out.println(s.charAt(8));*/
		         //NegativeArraySizeException
		         //int[] n = new int[-5];
		         //NumberFormatException
		         /*String s = "XX";
		         int n = Integer.parseInt(s);
		          */
		         //NullPointerException
		         /*String s = null
		         System.out.println(s.equals("Hello"));
		          */
		System.out.println(n);
	}

}

