package week1day2;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//fact--> 5! -->5*4*3*2*1
		
		//5*4=20
		//20*3=60
		//60*2=120
		//120*1==120
		
		
		int input=5;
		int fact=1;
		
		for(int i=1;i<=input;i++) {			
			fact=fact*i;//1*1			
			System.out.println(fact);
		}
		
		
		
		
	}

}
