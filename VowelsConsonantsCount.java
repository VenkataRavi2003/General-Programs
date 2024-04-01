import java.util.Scanner;
public class VowelsConsonantsCount{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the string : ");
		
		String str = sc.nextLine();
		
		str = str.toLowerCase();
		
		int vowelCount = 0;
		int consonantCount = 0;
		
		for(int i=0;i<str.length();++i){
			if(str.charAt(i) == 'a' ||str.charAt(i) == 'e'||str.charAt(i) == 'i'||str.charAt(i) == 'o'||str.charAt(i) == 'u')
				vowelCount++;
			else if(str.charAt(i)>='a' && str.charAt(i)<='z')
				consonantCount++;
		}
		System.out.println("\nVowels Count -> " + vowelCount);
		System.out.println("\nConsonants Count -> " + consonantCount);
	}
}