
import java.util.Date;
                
public class StudentResultSendEmail {       //print student information

	public void StudentResultSendEmail(ParticipantInformation participationInfomation) {

		String name = participationInfomation.getFirstName();
		String ln = participationInfomation.getLastName();
		String emailid = participationInfomation.getEmailAdress();
		Date date = participationInfomation.getDate();
		Double score = participationInfomation.getScore();
		String result = participationInfomation.getResult();
		System.out.println("Detail information of Quiz Taker : " + "\n" + "firstName: " + name + "\n" + "lastName :"
				+ ln + "\n" + "Email : " + emailid + "\n" + "Date" + date + "\n" + "score % : " + score + "\n"
				+ "Results :" + result + "\n");

	}
}
