package week3day1;

public class FindCharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="Testleaf";
		char c='z';
		int count=0;
		char[] ch = s.toCharArray();
		for(int i=0;i<=ch.length-1;i++) {
			if(ch[i]==c) {
				count++;				
			}
		}		
		System.out.println("The number of " +c+" present in the string " +s +" is " +count);
		
		
		
		
		
		
	}

}
