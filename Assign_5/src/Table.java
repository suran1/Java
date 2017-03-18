
//Print the multiplication table from 1 to 25 till the 10 times. The console should print 

public class Table {

	public static void main(String[] args) {
		System.out.println("Multiplication table from 1 to 25 till the 10:");
		
		int [] numbers  = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25};// create an Array 
		
		
		for(int i=0;i<numbers.length;i++){ //select number from 1-25
			
			System.out.println("---------");
			
			for(int j=0;j<10;j++){   //multiply till 10
				
				
				
			System.out.println(  numbers[i]+ "*"   +numbers[j]    +"="+   numbers[i]*numbers[j]);
			}
		}

	}

}
