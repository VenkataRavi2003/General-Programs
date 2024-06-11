import java.util.Scanner;
import java.util.InputMismatchException;
public class ConvertUppercaseCharToLowercase_And_LowercaseToUppercase{
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){

			System.out.print("\nEnter the string : ");
			String str = sc.nextLine();

			String res = convertLetters(str);
			System.out.println("\nAfter Converting :: "+res);

		}catch (InputMismatchException e) {
			System.out.println("\nInputMismatchException Occured :: "+e.getMessage());
		}catch (Exception e) {
			System.out.println("\nException Occured :: "+e.getMessage());
		}
	}
	public static String convertLetters(String str){

		StringBuilder sb = new StringBuilder();
		for (int i = 0 ; i < str.length() ; ++i) {
			
			char ch = str.charAt(i);

			if(ch >= 'A' && ch <= 'Z'){

				sb.append((char)(ch + 32));

			}else if(ch >= 'a' && ch <= 'z'){
				sb.append((char)(ch - 32));
			}else{
				
				sb.append(ch);
			}
		}

		return sb.toString();
	}
}