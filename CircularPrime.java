import java.util.Scanner;
import java.util.InputMismatchException;
public class CircularPrime{
	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){

			System.out.print("\nEnter the number : ");
			int num = sc.nextInt();
			if(num <= 0){
				System.out.println("\n"+num+" -> Not Circular Prime!!");
				sc.close();
				return;
			}

			if(isCircularPrime(num)){

				System.out.println("\n"+num+" -> Is Circular Prime.");

			}else {
				
				System.out.println("\n"+num+" -> Not Circular Prime!!");
			}

		}catch (InputMismatchException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static boolean isCircularPrime(int num){

		if(num <= 1)return false;

		int a = num;
		do{

			if(!isPrime(a))return false;

			a = circulate(a);

		}while(a!=num);

		return true;
	}
	public static boolean isPrime(int a){

		if(a <= 1)return false;

		for (int i = 2; i <= Math.sqrt(a); ++i) {
			
			if(a % i == 0) return false;
		}

		return true;
	}

	public static int circulate(int a){

		String str = Integer.toString(a);

		return Integer.parseInt(str.substring(1) + str.charAt(0));

	}
}