import java.util.Scanner;
import java.util.Date;

public class MainMethod {

	public static void main(String[] args) { // participation information

		System.out.println("Your are warm welcome to our online  Quiz competetion ! \n ");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your first name : \n ");

		String name = scanner.next();
		System.out.println("Enter your last name: \n ");
		String ln = scanner.next();

		ParticipantInformation participantInformation = new ParticipantInformation();
		participantInformation.setFirstName(name);
		participantInformation.setLastName(ln);
		Date date = new Date(); // current date object

		participantInformation.setDate(date);

		System.out.println("Enter your e-mail Id: \n  ");

		String adress = scanner.next();
		participantInformation.setEmailAdress(adress);
		
		System.out.println("Please choose your favorite Subject and enter number : \n ");
		System.out.println("1 for sports,  2 for Science,  3 for History, 4 for Geography \n");
		System.out.println("1.Sports " + "\n" + "2.Science " + "\n" + "3.History" + "\n" + "4.Geography: ");

		Sports sp = new Sports(); // different class different object call
		Science sc = new Science();
		History hy = new History();
		Geography gp = new Geography();

		int category = scanner.nextInt();

		switch (category) { // use switch case

		case 1:

			sp.quiz();
			participantInformation.setScore(sp.getScore());
			participantInformation.setResult(sp.getResults());
			participantInformation.setCount(sp.getNumberOfCorrectAnswer());
			break;

		case 2:

			sc.quiz();
			participantInformation.setResult(sc.getResults());
			participantInformation.setScore(sc.getScore());
			participantInformation.setCount(sc.getNumberOfCorrectAnswer());
			break;

		case 3:
			hy.quiz();
			participantInformation.setResult(hy.getResults());
			participantInformation.setScore(hy.getScore());
			participantInformation.setCount(hy.getNumberOfCorrectAnswer());
			break;

		case 4:

			gp.quiz();
			participantInformation.setResult(gp.getResults());
			participantInformation.setScore(gp.getScore());
			participantInformation.setCount(gp.getNumberOfCorrectAnswer());
			break;

		default:
			System.out.println("Thank you invalid quizCategory");

		}

		System.out.println("Thank you for Participation your report will be send via E-mail.");

		EmailUtil email = new EmailUtil();
		email.send(adress, participantInformation.getCount(), participantInformation.fullName());
	}

}
