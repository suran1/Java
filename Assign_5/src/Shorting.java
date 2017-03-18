import java.util.Arrays;

//1.Write a Java application to sort the given array to descending order without using any in-built function or API. 

//int [] A= {9,6,2,3,5,6,12,46,1};

public class Shorting {

	public static void main(String[] args) {
		System.out.println(" Given array to descending order:");
		
	int [] arrays = {9,6,2,3,5,6,12,46,1};
	
	for(int i=0;i<arrays.length;i++){
		
		for (int j=i+1;j< arrays.length;j++){
		if (arrays[i]<arrays[j]){
			
			
			int temp = arrays[i];
			arrays[i]=arrays[j];
			arrays[j]=temp;
			
			
		}
			
			
		}
	}
	System.out.println(Arrays.toString(arrays));
	}

}
