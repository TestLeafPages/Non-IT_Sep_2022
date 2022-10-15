package week3day1;

public class LearnString {

	public static void main(String[] args) {
		
		String s="Testleaf";
		String s1="Leaf";
		String s3="Testleaf";
		
		int x=10 ;
		x=x+10; //x=20 -->
		
		
		String s2=new String(s);
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		
		String concat = s.concat(s1); //append or add values to another string
		System.out.println("After appending s with s1 "+concat); 
		
		//TestleafLeaf -expectouput
				
		
		System.out.println(s);		
		
		System.out.println(s==s2);//will compare the memory address
		
		System.out.println(s==s3);//compare the memory address
		
		
		boolean equals = s.equals(s2);
		System.out.println("Compares the String values "+equals);
		
		
		

	}

}
