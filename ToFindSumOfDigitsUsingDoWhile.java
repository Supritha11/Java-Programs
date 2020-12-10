
public class ToFindSumOfDigitsUsingDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 123, sum = 0, n;
		do {
			n = m % 10;
			sum = sum + n;
			m /= 10;
		} while (m > 0);
		System.out.println("Sum of digits is : " + sum);
	}

}
