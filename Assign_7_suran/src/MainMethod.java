

public class MainMethod {

	public static void main(String[] args) {

		Arithmatic oddeven = new EvenAndOddOperation(); // the child class
														// object
		// odddeven.setZ(9);
		// oddeven.setX(5);
		// oddeven.setY(6);

		oddeven.setX(10);
		oddeven.setY(5);
		((EvenAndOddOperation) oddeven).setZ(45);

		((EvenAndOddOperation) oddeven).OddEven();
		
		

		System.out.println(" THE AVERAGE OF THREE NUMBERIS : " + ((EvenAndOddOperation) oddeven).findAverage(10, 20, 40));
		

		System.out.println(" THE SUM OF FIRST TWO INTGERS : " + oddeven.getX() + " and " + oddeven.getY() + " is  " + oddeven.sum(10, 5));
		

		System.out.println(" THE SUBTRACTION OF FIRST TWO INTGERS : " + oddeven.getX() + " and " + oddeven.getY() + " is " + oddeven.sub(10, 5));
		

		System.out.println(" THE MULTIPLY OF FIRST TWO INTGERS : " + oddeven.getX() + " and " + oddeven.getY() + " is " + oddeven.mul(10, 5));

	}

}
