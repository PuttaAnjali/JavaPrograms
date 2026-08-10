public class SumEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sumEven=0,sumOdd=0;
		for(int i=1;i<100;i++) {
			if(i%2==0) 
				sumEven+=i;
			else 
			sumOdd+=i;
			}
		System.out.println("Sum of even: "+sumEven+ "Sum of odd: "+sumOdd);
	}
}
