import java.util.Date;

public class ParticipantInformation { // java Beans class or entity class

	private String firstName;
	private String lastName;
	private String emailAdress;
	private Date date;
	private double score;
	private String result;
	private int count;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getCount() {

		return this.count;

	}

	public String fullName() {
		return this.firstName + " " + this.lastName;
	}

}
