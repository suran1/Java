import java.util.Scanner;

public class History {

	int marks = 0;
	double score;
	String pass;
	String fail;
	int count = 0;

	public void quiz() {

		
		System.out.println("Multiple  answer question: select your correct answer and enter number : \n ");
		
		System.out.println("Q. N .1 who was the first precedent of the  united states of America  ");
	
		System.out.println("1. Donald Trump , 2.Osama Bin Laden , 3. Georg Washington, 4.Georg W Bush ");

		Scanner scanner = new Scanner(System.in);
		int answer1 = scanner.nextInt();

		if (answer1 == 3) {

			marks = 5;
			count = 1;
		}

		System.out.println("Q. N .2 what was Ronald Reagan referring when he spoke of the evil empire ? ");
		System.out.println(
				"1.The Soviet Union , 2.The air traffic controllers union , 3.The People's Republic of China, 4 The Democratic Party ");

		int answer2 = scanner.nextInt();

		if (answer2 == 3) {

			marks += 5;
			count += 1;
		}

		System.out.println("Q.N 3 In which script is Nepali written?");

		System.out.println("1.Devaganari, 2.Sanskrit, 3.Urdu , 4.Nepali");

		int answer3 = scanner.nextInt();

		if (answer3 == 1) {

			marks += 5;
			count += 1;
		}

		score = marks * 100 / 15;

		// System.out.println ("your total score is : " + marks);

	}

	public int getNumberOfCorrectAnswer()

	{
		return count;
	}

	public double getScore() {

		return score;
	}

	public String getResults() {

		String result = this.score >= 50 ? "pass " : "fail";

		return result;

	}
}
