package week3day2;

public  class Apartment extends PartialHouse implements Land{

	public void rowHouse() {
		System.out.println("Built by Appartment investor");
		
	}

	public void apartment() {
		System.out.println("Method from Apartment class");
		
	}

	@Override
	public  void cupboards() {
		System.out.println("Modular cupboard");
	}

	
	public void kitchen() {
		System.out.println("Traditional kitchen");
	}
	
	
}
