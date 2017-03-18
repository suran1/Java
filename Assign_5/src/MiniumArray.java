

//1.	Write a Java application to find the minimum number of any array.

public class MiniumArray {

	public static void main(String[] args) {
		int [] A = {9,6,2,3,5,6,12,46,90};

 int smallestNumber= 12;

 
 
 for(int i=0;i<A.length;i++){
	 
	 if(smallestNumber>A[i]){
		 
		 smallestNumber=A[i];
	 }
 }
 
 System.out.println("Smallest number in array is : " +smallestNumber);

	}

}
