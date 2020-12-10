
public class ToFindNumberOfDaysInMonth {
	public static void main(String args[]) {
		String month = "Nov";
		switch (month) {
		case "Jan":
			System.out.println("Jan has 31 days");
		case "Feb":
			System.out.println("Feb has 28 days");
			break;
		case "March":
			System.out.println("Mar has 31 days");
			break;
		case "Apr":
			System.out.println("Apr has 30 days");
			break;
		case "May":
			System.out.println("May has 31 days");
			break;
		case "Jun":
			System.out.println("Jun has 30 days");
			break;
		case "Jul":
			System.out.println("Jul has 31 days");
			break;
		case "Aug":
			System.out.println("Aug has 31 days");
			break;
		case "Sept":
			System.out.println("Sept has 30 days");
			break;
		case "Oct":
			System.out.println("Oct has 31 days");
			break;
		case "Nov":
			System.out.println("Nov has 30 days");
			break;
		case "Dec":
			System.out.println("Dec has 31 days");
			break;
		default:
			System.out.println("Enter valid  month");
		}

		}

	}
