
public class ToFindMarksRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program to find marks range for a given grade");
		char grade = 'F';
		switch (grade) {
		case 'A':
			System.out.println("Your percentage is between 85 to 100");
			break;
		case 'B':
			System.out.println("Your percentage is between 70 to 84");
			break;
		case 'C':
			System.out.println("Your percentage is between 69 to 50");
			break;
		case 'D':
			System.out.println("Your percentage is between 49 to 35");
			break;
		default:
			System.out.println("Enter the valid grade");
		}
	}

}
