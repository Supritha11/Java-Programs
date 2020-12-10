
public class ToCheckPositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ToCheckPositiveOrNegative ref = new ToCheckPositiveOrNegative();
		int num1 = 10;
		ref.toCheckPositiveOrNegativeNumber(num1);
		int num2 = -6;
		ref.toCheckPositiveOrNegativeNumber(num2);
		int num3 = 0;
		ref.toCheckPositiveOrNegativeNumber(num3);

	}

	void toCheckPositiveOrNegativeNumber(int num) {
		if (num > 0) {
			System.out.println(num + " is Positive Number");

		} else if (num < 0) {
			System.out.println(num + " is Negative Number");
		} else {
			System.out.println(num + " is neither positive nor negative number");
		}
	}
}
