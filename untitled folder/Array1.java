

//Q.N 3If an array A={4,7,12,80,34,75,67,89,39}, find the total sum of the numbers in an array

//which are divisible by 3.



public class Array1 {

	public static void main(String[] args) {
		
		int sum=0;
		
		int [] A = {4,7,12,80,34,75,67,89,39};
		
		for(int i=0;i<A.length;i++){
			
			
			if(A[i]%3==0){
				
				
				sum=sum+A[i];
				
				
				
				}
			
			
	
			
			
		}
		
		System.out.print("Total sum of the numbers in a array which are divisible by 3: " + sum);
		
	}

}
