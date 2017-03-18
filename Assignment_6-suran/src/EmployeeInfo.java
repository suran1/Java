import java.util.Arrays;

public class EmployeeInfo {

public static void main(String[] args) {
		
Employee employee1 = new Employee(); // object create by using default constructor
		
employee1.firstName = "Hari";
employee1.lastName = "Sharma";
employee1.designation = "Manager";
employee1.age=45;
employee1.employeeAdress = "Dodge City, Kansas";
employee1.phoneNumber = 33456787;
employee1.monthlySalary =10000.00;

Employee employee2 = new Employee();

employee2.firstName = "Sita";
employee2.lastName = "Thapa";
employee2.designation = "Developer";
employee2.age= 24;
employee2.employeeAdress = "Sacramento, California";
employee2.phoneNumber = 33456787;
employee2.monthlySalary=8000.00;

Employee employee3 = new Employee();

employee3.firstName = "Prabin";
employee3.lastName = "Poudel";
employee3.designation = "Tester";
employee3.age= 34;
employee3.employeeAdress = "Rexburg,Idhao";
employee3.phoneNumber = 98767898;
employee3.monthlySalary=7450.50;


Employee employee4 = new Employee();

employee4.firstName = "Kuber";
employee4.lastName = "Adhikari";
employee4.designation = "HR";
employee4.age= 40;
employee4.employeeAdress = "Miami, Florida";
employee4.phoneNumber = 34545656;
employee4.monthlySalary=7880.70;

Employee employee5 = new Employee();

employee5.firstName = "Hira";
employee5.lastName = "Sedai";
employee5.designation = "Developer";
employee5.age= 29;
employee5.employeeAdress = "Alexandria,virginea";
employee5.phoneNumber = 32343434;
employee5.monthlySalary=8000.00;


Employee employee6 = new Employee();

employee6.firstName = "Krishna";
employee6.lastName = "Nepal";
employee6.designation = "Developer";
employee6.age= 32;
employee6.employeeAdress = "Baltimore, Maryland";
employee6.phoneNumber = 56565667;
employee6.monthlySalary=8000.00;

//Employee employee = new Employee();  // 


Employee employee = new Employee("Hari","sharma",100000); // object create by using parameterize constructor

System.out.println(employee.firstName);
System.out.println(employee.lastName);
System.out.println(employee.monthlySalary); 

System.out.println("The full name of the employee are");

System.out.println(employee1.getName());
System.out.println(employee2.getName());
System.out.println(employee3.getName());
System.out.println(employee4.getName());
System.out.println(employee5.getName());
System.out.println(employee6.getName());

Employee.setEmployerAdress(); // static method call direct


double [] expenses={employee1.monthlySalary, employee2.monthlySalary,employee3.monthlySalary,employee4.monthlySalary,employee5.monthlySalary, employee6.monthlySalary};
double sum= 0;
for (int i=0; i< expenses.length; i++){
	
	
	sum += expenses[i];
}
System.out.println("The total expenses of the company that goes for salary per month  " + sum);



System.out.println("The full name of the employees who are developers. ");

String [] designation = {employee1.designation,employee2.designation,employee3.designation,employee4.designation,employee5.designation,employee6.designation};
String [] name = {employee1.getName(),employee2.getName(),employee3.getName(),employee4.getName(),employee5.getName(),employee6.getName()};

for (int i=0; i< designation.length;i++){
	
	if (designation[i]== "Developer"){
		
		System.out.println(name[i]);
	}
}
System.out.println("The average age of the employee of the company.");


int [] age = {employee1.age,employee2.age,employee3.age,employee4.age,employee5.age,employee6.age};

 double average =0;
 
 int  totalAge = 0;
 
 for (int i = 0; i<age.length; i++){
	 
	 totalAge+=age[i];
	 
	
	
 }
 average = totalAge/(age.length);
 System.out.println(average);

 for (int i = 0; i<age.length; i++){
	 
	 for (int j =i+1;j<age.length; j++){
		 if(age[i]>age[j]){
			 
			int temp = age[i];
			age[i]=age[j];
			age[j]= temp ;
			 
			}
		 
		}
	 }

 System.out.println("Employee’s age from young to old " );
 
 System.out.println(Arrays.toString(age));
}

}
