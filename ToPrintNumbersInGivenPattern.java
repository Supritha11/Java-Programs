
public class ToPrintNumbersInGivenPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("To print numbers in given pattern");
		int i, j;
		for (i = 5; i >= 1; i--) {
			for (j = 5; j >= i; j--) {
				System.out.print(j + "  ");
			}
			System.out.println();
		}
	}
}
