package week3day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {

		String[]	values = {"Adam","Ben", "Zara","Adam", "Charlie", "James","Ben","Adam"} ;
		
		//Array to List
		List<String> list=new ArrayList<String>(Arrays.asList(values));
		System.out.println(list);
		
		//List to Set
		
		Set<String> setName=new HashSet<String>(list);
		System.out.println(setName);
		
		
		
		Set<String> s1=new LinkedHashSet<String>(list);
		System.out.println(s1);
		
		Set<String> s2=new TreeSet<String>(list);
        System.out.println(s2);
		
		Set<String> s=new LinkedHashSet<String>();		
        for(int i=0;i<list.size()-1;i++) {
        	if(!s.add(list.get(i))) { 
        		System.out.println(list.get(i));
        	}
        }
        
        
        System.out.println(s);
        Set <String> set=new LinkedHashSet<String>();
        set.add("Renu");
        set.add("Somu");
        set.add("Adam");
        set.add("Ben");
        set.add("James");
        set.add("Charlie");
        
        
        
        boolean removeAll = set.removeAll(s);        
        System.out.println(removeAll);        
        System.out.println(set);       
        set.add("vidya");
        
        Set <String> val=new LinkedHashSet<String>();      
        val.add("Adam");
        val.add("Ben");
        val.add("James");
        val.add("Tanu");
        val.add("Vidya");
        
        //retainAll--finds the instersection of Elements and print that
        boolean retainAll = val.retainAll(set);        
        System.out.println(set);
        
    	}

}
