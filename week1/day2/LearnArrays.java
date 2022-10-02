package week1day2;

import java.util.Arrays;

public class LearnArrays {

	public static void main(String[] args) {
		
		
		//to store multiple set of data of same datetype under one single variable-Array
		//syntax--> datatype[] variableName = {value1,value2, value3}
		int[] num= {1,2,3,4,5,6}; //literal declaration
		String[] names= {"vidya","Hema","Priya","Vanitha","Sai"};
		float[] height= {5.2f,5.1f,5.5f};
		
	//To access the element in the array is through index  ,starts with the index zero
		//to print any element from the array ->variableName[index]
		System.out.println("The first element "+num[0]);
		System.out.println("The last element " +num[5]);
		//short cut to store/to know the return type of the method/property -->ctrl 2 l
		int length = num.length;
		System.out.println(num.length);
		System.out.println(num[length-1]);
		
		
		//to get the last element of the string array
		int strLength = names.length;		
		System.out.println(names[strLength-1]);
		
    	// to print all the elements from the array
		System.out.println(height);//not applicable
		
		
		System.out.println(Arrays.toString(names));
		
		for(int i=0;i<length;i++) {
			System.out.println(num[i]);
		}
		
		//to arrange the array values in an order(ascending Order)
		int[] n= {3,2,5,1,6};
		Arrays.sort(n);
		
		System.out.println(Arrays.toString(n));
		
		//to reverse an array		
		for(int i=n.length-1;i>=0;i--) {
			System.out.print(n[i]);

		}
		System.out.println();			
	int[] number=new int[5];
	number[0]=11;
	number[1]=12;
	number[2]=13;
	number[3]=14;
	number[4]=15;
		
		System.out.println(Arrays.toString(number));
		
		
		
		
		
		
		
	}
}
