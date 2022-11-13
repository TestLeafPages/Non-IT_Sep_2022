package testcase;

public class LearnConWithThis {
	int x=10; // class variable /instance variable
	String name;
	static final int y=18;
	public void method(int x, String name) {
		this.x = x;
		this.name = name;
		System.out.println(x);
	}
	public LearnConWithThis() {
		System.out.println("From default Constructor");
	}
	
	public LearnConWithThis(int age) {
		System.out.println("From single parameter Constructor" +age);
	}
	
	public LearnConWithThis(int x, String name) {
		this(10);
		this.x = x;
		this.name = name;
		System.out.println("Parametrized Constructor calls default");
	}
	
	
	
	
	public static void main(String[] args) {
		LearnConWithThis obj = new LearnConWithThis();
		LearnConWithThis obj2 = new LearnConWithThis(4, "Sathya");
		// for instance variable
		System.out.println(obj.x);
		System.out.println(obj.name);
		// runtime data to normal method which assign the value using this to global
		// variable
		obj.method(5, "Aravind");
		// from instance vaibale after assigning the value through normal method
		System.out.println(obj.x);
		System.out.println(obj.name);

		// parametrized constructor assign value to global variable using this
		System.out.println(obj2.x);
		System.out.println(obj2.name);

	}

}
