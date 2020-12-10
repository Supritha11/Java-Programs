
public class SwitchInsideAnotherSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int college = 3;
		int branch = 1;
		switch (college) {
		case 1:
			System.out.println("GSSS");
			break;
		case 2:
			System.out.println("others");
			break;
		default:
			System.out.println("Select valid option");
		}
		switch (branch) {
		case 3: {
			System.out.println("EEE");
			System.out.println("Subjects in EEE");
			System.out.println("1.ECA");
			System.out.println("2.FT");
			System.out.println("3.T&D");
			break;
		}
		case 4: {
			System.out.println("CS");
			System.out.println("Subjects in CSE");
			System.out.println("1.Java");
			System.out.println("2.OOPS");
			System.out.println("3.ADA");
			break;
		}
		default:
			System.out.println("Select valid " + " option");
		}

	}
}
