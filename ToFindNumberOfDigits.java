
public class ToFindNumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 123, count = 0;
		do {
			m /= 10;
			++count;
		} while (m != 0);
		System.out.println("Number of digits : " + count);
	}

}
