import java.util.Arrays;

//Q.N 1. Create an array of numbers from 500 to 1000 which are divisible by 5.
			


public class Array2 {

	public static void main(String[] args) {
	int [] arrays = new int [100];
		
	
	int count = 0;
		for (int i =500;i<1000;i++){
			
			
			if (i %5 ==0){
				
			arrays [count] = i;
		
				System.out.println(arrays[count]);
				
				count++;
			}
			
		}
		

	
	}

}
