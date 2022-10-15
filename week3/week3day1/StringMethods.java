package week3day1;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s= "Learning String";
		String s1="Learning Java";
		//length of the string
		int length = s.length();
		System.out.println("String Length:  " +length);
		
		//to append
		String concat = s.concat("methods");
		System.out.println(concat);
		
		//to retreieve any character from the string (particular index)
		
		char charAt = s.charAt(3); //index starts with zero
		System.out.println(charAt);
		
		
		//to convert a string into a character array
		char[] charArray = s.toCharArray(); //[L,e,a,r,n,i,n,g, ,S,t,r,i,n,g]
		System.out.println(Arrays.toString(charArray));
		
		//to compare the string values
		boolean equals = s.equals("Learning string");
		System.out.println(equals);
		
		//to ignore the cases of a string during comparison
		boolean equalsIgnoreCase = s.equalsIgnoreCase("Learning string");
		System.out.println(equalsIgnoreCase);
		
		//to convert the string with lowercases
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		
		//to convert the string with uppercase
		System.out.println(lowerCase.toUpperCase());
		
		
		//to check the given charseq is present in the given string
		boolean contains = s.contains("ear");
		System.out.println(contains);
		
		//to check the starting charseq of a string
		boolean startsWith = s.startsWith("Le");
		System.out.println(startsWith);
		
		
	}

}
