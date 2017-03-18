
// 3.b create the subclass of “Arithmetic” 	“EvenAndOddOperation” and add 2 separate methods to find the 
// even numbers and odd numbers in this child class.

public class EvenAndOddOperation extends Arithmatic implements Mathmetics {

	private int z;

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	// method Odd Even

	public void OddEven() {
		int[] array = { getX(), getY(), getZ() };

		for (int i = 0; i < array.length; i++) {

			if (array[i] % 2 == 0) {
				System.out.println(" The number " + array[i] + " is Even number ");
			} else if (array[i] % 2 != 0) {

				System.out.println(" The number " + array[i] + " is Odd number ");

			}
		}

	}

	// Q.N 5 Implement the “Mathematics” class in the class
	// “EvenAndOddOperation” and implements its
	// method to find the average of 3 numbers.

	@Override // interface implement
	public double findAverage(int a, int b, int c) {

		x = a;
		y = b;
		z = c;

		double average = (x + y + z) / 3;
		return average;
	}

}