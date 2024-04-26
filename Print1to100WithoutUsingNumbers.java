public class Print1to100WithoutUsingNumbers{
	public static void main(String[] args) {
		
		int one = 'A' / 'A'; // A = 65 ascci value , so 65/65 results in 1

		String str = ".........."; // here 10 dots has taken , 
		                           //so we can easily get the String size as 10 and we can multiply with 
		                           // str.length() * str.length() results in 100.

		for (int i = one; i <= (str.length() * str.length()) ; ++i ) {

			System.out.print(i+" ");
		}
	}
}