package week3day1;

import java.util.Arrays;

public class LearnStringreverse {

	public static void main(String[] args) {
		//to reverse the string 
		String s= "vidya";
	//	char c = 0;
		
		char[] ch = s.toCharArray();
		
		System.out.println(Arrays.toString(ch));
		
		for(int i=ch.length-1;i>=0;i--) {
			System.out.print(ch[i]);
			/*
			 * c=ch[i]; System.out.print(c);
			 */

		}
		
		
		
		
		
		
	

	}

}
