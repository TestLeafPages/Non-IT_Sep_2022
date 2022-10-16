package week3day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassroomAssignment {

	
	public static void main(String[] args) {
		
		String[]	list = {"Adam","Ben", "Zara","Adam", "Charlie", "James","Ben","Adam"} ;
		
		List<String> values=new ArrayList<String>(Arrays.asList(list));
		System.out.println(values);
		List<String>duplist=new ArrayList<String>();
		
		for(int i=0;i<values.size();i++) {
			for(int j=i+1;j<values.size()-1;j++) {
				if(values.get(i).equals(values.get(j))) {
					duplist.add(values.get(j));
				}				
			}
			
			
		}		
		
		System.out.println(duplist);		
		
		  boolean removedAll = values.removeAll(duplist);
		  System.out.println(removedAll); 
		  System.out.println(values);
		 
		
		
		
		
		
	}
	
}
