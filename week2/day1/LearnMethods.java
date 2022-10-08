package learnjava;

public class LearnMethods {

	int rollno = 25;

	public int student1() {
		int noOfStundents = 45;
		System.out.println(rollno);
		return noOfStundents;
	}

	public int strudent2() {
		String name = "Balaji";
		int noOfStundents = 25;
		return noOfStundents;
	}

	public void student3() {
		int noOfStundents = 35;
	}

	public static void main(String[] args) {
		LearnMethods stu = new LearnMethods();
		int student1 = stu.student1();
		System.out.println(student1 + 2);
		stu.student3();
		int roll = stu.rollno;
		System.out.println(roll);

	}

}
