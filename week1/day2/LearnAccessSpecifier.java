package week1day2;

public class LearnAccessSpecifier {
	
	public void anyOne() {
		System.out.println("I am from Public method");
	}
	
	private void restrictedAccess()
	{
		System.out.println("I am from private method");
	}
	
	protected void extendedClasses() {
		System.out.println ("I am from protected method");
	}
	
	void outofPackage() {
		System.out.println("I am from default method");
	}

	public static void main(String[] args) {

		LearnAccessSpecifier methods=new LearnAccessSpecifier();
		methods.anyOne();
		methods.extendedClasses();
		methods.restrictedAccess();
		methods.outofPackage();
		
		
	}

}
