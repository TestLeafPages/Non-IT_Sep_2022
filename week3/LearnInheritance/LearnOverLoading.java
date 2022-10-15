package LearnInheritance;

public class LearnOverLoading {

	public void studentInfor(String name, String lastname) {

		System.out.println(name + "  " + lastname);
	}

	public void studentInfor(int rollno) {

		System.out.println(rollno);

	}

	public void studentInfor(int ht, float wt) {

		System.out.println(ht + " " + wt);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LearnOverLoading call = new LearnOverLoading();
		call.studentInfor(12);
		call.studentInfor(123, 56.30f);
		call.studentInfor("Vidya", "R");

	}

}
