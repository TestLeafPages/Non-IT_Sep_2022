package testcase;



public class LearnConstructor {
	int x;
	String name;
		
	public LearnConstructor(int b ,String Name ) {
		System.out.println(b+"--> "+ Name);
		
	}
	
	public static void main(String[] args) {
		
		LearnConstructor obj=new LearnConstructor(2,"Jeya");
		
		LearnConstructor obj2=new LearnConstructor(3,"Balaji");
		
		
		
		
	}

}
