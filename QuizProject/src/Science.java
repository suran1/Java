import java.util.Scanner;

public class Science {

	int marks = 0;
	double score;
	String pass;
	String fail;
	int count = 0;

	public void quiz() {

		System.out.println("Multiple  answer question: select your correct answer and enter number : \n ");
		System.out.println("Q. N .1 what is laughing gas ?  \n ");
		System.out.println("1. Nitrous Oxide,   2.Carbon monooxide,    3.Sulphur dioxide   4.Hydrogen peroxide \n ");

		Scanner scanner = new Scanner(System.in);
		int answer1 = scanner.nextInt();

		if (answer1 == 1) {

			marks += 5;
			count = 1;
		} else {

			marks = 0;
		}

		System.out.println("Q.N 2 who discover the element Oxygen \n ");
		System.out.println("1.Francis Crick,    2.Joseph Priestley,   3.Louis Pasture,   4.Max Plank ");
		int answer2 = scanner.nextInt();
		if (answer2 == 2) {

			marks += 5;
			count += 1;

		} else {
			marks += 0;
		}

		System.out.println("Which of the following is the lightest metal ? \n ");
		System.out.println("1.Mercury,     2.Lithium,       3.Lead,        4.Silver ");
		int answer3 = scanner.nextInt();
		if (answer3 == 2) {

			marks += 5;
			count += 1;
		} else {

			marks += 0;
		}

		double score = (marks * 100) / 15;
		// System.out.println("your total correct answer is : " + marks);

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
