package week1day2;

public class LearnConditionalStatement {

	public static void main(String[] args) {

		int age = 17;

		// voting
		// syntax-->if(Condition){}

		if (age >= 18) {
			System.out.println("Right to vote");
		} else {
			System.out.println("No rights to Vote");
		}

		// to comment multiple line -->ctrl shift /
		// to uncomment ctrl shift \

		int x = 0;

		if (x > 0) {
			System.out.println("The number is positive");
		} else if (x < 0) {
			System.out.println("The number is negative");
		} else {
			System.out.println("The number is neutral");
		}

		// || -anyone condtion is satified -->logic will be executed
		// && -->both the given condition to be true-->it will execute the logic
		int num = 13;
		// num%3 -->remainder -->0==0

		if (num % 3 != 0 || num >= 0) {
			num++;
			System.out.println(num);
		} else {
			System.out.println("The number is divisible by 3");

		}

		int Y = 13;
		if (Y % 3 != 0 && Y >= 0) {
			Y++;
			System.out.println("To check logicsl condition " + Y);
		} else {
			System.out.println("The number is divisible by 3 using logical operator");

		}

	}

}
