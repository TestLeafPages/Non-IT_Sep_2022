package testcase;

public class LearnFinal {

	static final int x=10;
	
	public void finalVar() {
		//x=15; not possible
		System.out.println(x);
	}
		
	public static final void method() {
		// constant method but can be accessed anywhere
	}
	public static void main(String[] args) {
		
		LearnFinal obj=new LearnFinal();
		System.out.println(x);
		int x2 = x;// as it is static called directly
		x2=x2+10;
			
		
	}

}
