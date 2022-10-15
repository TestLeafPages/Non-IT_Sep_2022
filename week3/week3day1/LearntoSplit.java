package week3day1;

import java.util.Arrays;

public class LearntoSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		String s="Learning String with Testleaf";
		String rev="";
		//String Learning
		
		String[] split = s.split(" ");
		
		System.out.println(Arrays.toString(split));
						
		  for(int i=split.length-1;i>=0;i--) {
		  
		  System.out.print(split[i]+" "); 
		  }
		  
		  System.out.println();
		 
		  
		  //to get the string from the respective index
		String substring = s.substring(6,11);
		
		System.out.println(substring);
		
		
		//to replace any character in a String
		String replace = s.replace("f", "t");
		System.out.println(replace);		
		
		
		
		
		
		
	}

}
