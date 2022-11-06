package learnAttributes;

import org.testng.annotations.Test;



public class LearntoPrioritize {

	
	@Test(priority=2)
	public void hyundaiCar() {
        System.out.println("TO buy a Hyundai i10");
	}

	@Test(priority=1,timeOut=2000)
	public void kiaCar() throws InterruptedException {
		Thread.sleep(5000);
          System.out.println("TO buy Kia seltos");
	}

	@Test()
	public void altoCar() {
           System.out.println("To buy a alto");
           
	}

}
