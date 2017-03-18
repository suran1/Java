


//Q.N 2. Create an array of name of the months of the year and print all the names that start from ‘J’.

 



public class Array {

	public static void main(String[] args) {
		
		String [] years =   {"Jan", "Feb", "Mar", "Apr","  May","Jun", "July",  "Aug","Sep",  "Oct"," Nov", "Dec"};
		
		
for (String month:years){
	if (month.startsWith("J")){
		
		System.out.println(month);
		
		}
         }

     }

}