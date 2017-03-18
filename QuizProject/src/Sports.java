import java.util.Scanner;

public class Sports {
	double score;
	int marks = 0;
	String pass;
	String fail;
	int count = 0;

	public void quiz() {
		System.out.println("Multiple  answer question select your correct answer and enter number : \n ");
		System.out.println("Q. N .1 Who is the number one footballer in the world?   \n ");
		System.out.println("1.George Best,   2.Lionel Messi,    3.Cristiano Ronaldo,     4.Neymar ");

		Scanner scanner = new Scanner(System.in);
		int answer1 = scanner.nextInt();

		if (answer1 == 3) {
			count = 1;
			marks += 5;

		} else {
			marks = 0;

		}
		System.out.println("Q. N .2. Which term is related with the game of Cricket ? \n");
		System.out.println("1.Double fault ,   2.Bouncer,   3.Mid Court ,    4.Checkmate ");

		int answer2 = scanner.nextInt();

		// for(int i= 0; i<3; i++)

		if (answer2 == 2) {
			count += 1;
			marks += 5;

		} else {

			marks += 0;

		}
		System.out.println("Q. N. 3 What is Lionel Messi's jersey number ? \n ");
		System.out.println("1. 10,      2.33,      3.28,       4.16 ");
		int answer3 = scanner.nextInt();

		if (answer3 == 1) {
			count += 1;
			marks += 5;

		} else {

			marks += 0;
		}

		score = (marks * 100) / 15;

		// System.out.println("your total score is : " + marks);

	}

	public int getNumberOfCorrectAnswer()

	{
		return count;
	}

	public double getScore() {

		return score;
	}

	public String getResults() {

		String result = this.score >= 50 ? "pass" : "fail";

		return result;
	}
}
