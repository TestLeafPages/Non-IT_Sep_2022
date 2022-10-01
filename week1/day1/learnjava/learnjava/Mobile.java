package learnjava;

public class Mobile {

	public void sendSms() {
		System.out.println("Happy learning");
	}
	public void takeSnap() {
		System.out.println("Picture with good quality");
	}
	
	
	public static void main(String[] args) {

		Mobile m =new Mobile();
		m.takeSnap();
		m.sendSms();
		
	}

}
