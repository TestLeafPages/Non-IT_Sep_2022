package learnAttributes;

import org.testng.annotations.Test;



public class Learnenabled {

	
	@Test(invocationCount=3,invocationTimeOut=3000)
	public void hyundaiCar() {
        System.out.println("TO buy a Hyundai i10");
	    }

	
	  @Test(dependsOnMethods={"altoCar"}) public void kiaCar() {
	  System.out.println("TO buy Kia seltos"); }
	  
	  @Test() public void altoCar() throws Exception {
	  System.out.println("To buy a alto"); throw new Exception();
	  
	  }
	  
	  @Test() public void FordCar() throws Exception {
	  System.out.println("To buy a ab"); //throw new Exception();
	  
	  }
	  @Test(enabled=false) 
	  public void HondaCar()  {
		  System.out.println("To buy a ab"); 
		  
		  }
		 
	
}
