
public class ToFindSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 15, c = 20;
		ToFindSmallestNumber ref = new ToFindSmallestNumber();
		int res1 = ref.toFindSmallestNumber(a, b, c);
		System.out.println(res1 + " is Smallest number");
		int res2 = ref.toFindSmallestNumber(25, 100, 5);
		System.out.println(res2 + " is Smallest number");
	}

	int toFindSmallestNumber(int a, int b, int c) {
		int result = 0;
		if (a < b) {
			if (a < c) {
				result = a;
			} else {
				result = c;
			}
		} else {
			if (b < c) {
				result = b;
			} else {
				result = c;
			}
		}
		return result;

	}

}
