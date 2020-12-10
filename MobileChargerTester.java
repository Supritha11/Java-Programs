
public class MobileChargerTester {
	public static void main(String args[]) {
		MobileCharger MiCharger = new MobileCharger();
		MobileCharger.brand = MI;
		MobileCharger.color = White;
		MobileCharger.price = 999;
		MobileCharger.usbtype = 'C';
		System.out.println("Details of mobile charger");
		System.out.println("brand :" + MobileCharger.brand);
		System.out.println("color :" + MobileCharger.color);

	}
}
