package learnjava;

public class LearnNestedloop {

	public static void main(String[] args) {
	
		int [] num= {1,2,4,3,6,5};
		int[] num1={1,2,7,3,4,5};
		String[] name= {"Vidya","Hema","Priya","Sandhiya"};
		String[] name1= {"bharthi","Malini","Dharsini","09"};

		//num[0]=1
		//num[1]=2
		
	     int size = num.length;	
		 int size1=num1.length;
	
		
		
		for(int i=0;i<name.length;i++) {
			System.out.println(i+"index = "+name[i]);
			for(int j=0;j<name1.length;j++) {
				System.out.println(i +"index = "+ name1[j]);
			}			
		}
		

	}

}
