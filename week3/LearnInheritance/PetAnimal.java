package LearnInheritance;

public class PetAnimal extends Animal {

	
	public void safeGaurd() {
		System.out.println("Protects the house");
	}
	
	public void petToPerson() {
	
		System.out.println("Attached to human");
	}
	
	public void noOfLegs(int legs) {
		super.noOfLegs(3);
		System.out.println(legs);
	}
	
}
