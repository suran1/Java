
    public class Employee {
	// class variables,method,constructor

	String firstName;  // instance variable or member variable
	String lastName;
	String designation;
	int age;
	String employeeAdress;
	long phoneNumber;
	double monthlySalary;
	static String employerAdress = "New York";
	

	Employee() { // default constructor

	}

	Employee(String firstName, String lastName, long salary) { // parameterize  constructor
															                         

		this.firstName = firstName;
		this. lastName = lastName;
		monthlySalary = salary;

	} 

	public String getName() { // method

		String fullName = this.firstName + " " + this.lastName;
		return fullName;

	}

	public static void setEmployerAdress() {
		System.out.println(employerAdress);

	}

}
