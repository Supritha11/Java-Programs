
public class ToCheckPositiveOrNegativeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		toCheckPositiveOrNegativeNumber(num1);
		int num2 = -9;
		toCheckPositiveOrNegativeNumber(num2);
		int num3 = 0;
		toCheckPositiveOrNegativeNumber(num3);
		System.out.println("End of Program");
	}

	static void toCheckPositiveOrNegativeNumber(int num) {
		if (num > 0) {
			System.out.println(num + " is Positive Number");

		} else if (num < 0) {
			System.out.println(num + " is Negative Number");
		} else {
			System.out.println(num + " is neither positive nor negative number");
		}
	}

}
