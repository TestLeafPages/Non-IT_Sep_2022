package week3day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LearntoConvertArraytoList {

	public static void main(String[] args) {
		
		
		String[]s= {"Apple","Mango","Chicku"};
		
		List<String> fruits=new ArrayList<String>();
		
	//	System.out.println(fruits);
		
		for(int i=0;i<s.length;i++) {			
			fruits.add(s[i]);
		}		
		
		System.out.println(fruits);		
		
		
		
		List<String> f=new ArrayList<String>(Arrays.asList(s));
		//System.out.println(f);
		
		for (String string : f) {  //Wrapperclass Variable: List/Array
			System.out.println(string);
		}
		
		
		
	}

}
