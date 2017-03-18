
//  Q.N 3 Create the concrete class “Arithmetic” and add 3 methods which will add, subtract, and multiply two integer numbers 
//   and return an integer. Again, create the subclass of “Arithmetic”  “EvenAndOddOperation” and add 2 separate methods
//   to find the even numbers and odd numbers in this child class.

public class Arithmatic { // class

	public int x;
	public int y;

	public int getX() { // getter & setter method
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int sum(int x, int y) { // Arithmetic operation
		int sum = this.x + this.y;
		return sum;

	}

	public int sub(int x, int y) {

		int sub = (this.x - this.y);
		return sub;

	}

	public int mul(int x, int y) {

		int mul = (this.x * this.y);
		return mul;

	}
}
