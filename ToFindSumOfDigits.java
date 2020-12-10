
public class ToFindSumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToFindSumOfDigits ref = new ToFindSumOfDigits();
		int num1 = 123;
		ref.toFindSumOfDigits(num1);
		int num2 = 111;
		ref.toFindSumOfDigits(num2);
		int num3 = 555;
		ref.toFindSumOfDigits(num3);

		System.out.println("End of Program");

	}

	void toFindSumOfDigits(int num) {
		int sum = 0, n;
		while (num > 0) {
			n = num % 10;
			sum = sum + n;
			num = num / 10;
		}
		System.out.println("Sum of Digits:" + sum);

	}

}
