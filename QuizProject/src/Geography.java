import java.util.Scanner;

public class Geography {
	int marks = 0;
	String pass;
	String fail;
	double score;
	int count;

	public void quiz() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Multiple  answer question: select your correct answer and enter number : \n ");
		System.out.println(" Q. N .1 What is the longest river in the United States?");
	
		System.out.println("1.The Colorado River, 2. The Dead Sea, 3. The Mississippi River, 4.The Missouri River");

		int answer1 = scanner.nextInt();
		if (answer1 == 4) {
			marks += 5;
			count = 1;
		} else {
			marks = 0;

		}

		System.out.println("Q. N 2.What is the tallest mountain in the United States?");

		System.out.println("1.Everest, 2.Mount Rainer, 3.Mount Mckinely, 4.Mount Rushmore");

		int answer2 = scanner.nextInt();

		if (answer2 == 3) {
			marks += 5;
			count += 1;
		} else {
			marks += 0;
		}

		System.out.println("Q. N.3 What is the largest lake in America? ");
		System.out.println("1.Lake Eerie, 2. Rara Lake, 3. Lake Superior, 4.Lake Michigan");

		int answer3 = scanner.nextInt();

		if (answer3 == 3) {
			marks += 5;
			count += 1;
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
