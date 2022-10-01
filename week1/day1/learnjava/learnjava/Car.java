package learnjava;

public class Car {	
	//instance
	int x=10;
		public void driveCar() {
		String name="BMW";
		System.out.println(name);
	}	
	public int applybreak() {	
		int z=3+3;		
		return z;
	}		
	public void soundHorn(boolean horn)
	{			
		System.out.println(horn);
	}
	
	public static void main(String[] args) {
		//Classname objname=new Classname(); syntax to create an object
		
		Car m = new Car();
	    m.driveCar();   
	    
	    
		System.out.println(m.x);
		int x2 = m.x;		
		System.out.println(x2+5);		
		
		m.soundHorn(false);
		
		
		int applybreak = m.applybreak();		
		System.out.println(applybreak+5);
			   
		
		
		
	}

	

}
