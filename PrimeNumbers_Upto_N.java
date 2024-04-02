import java.util.Scanner;
public class PrimeNumbers_Upto_N{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the size upto where you need to find primes : ");
		int size=sc.nextInt();
		
		if(size<0){
			System.out.println("\n"+size+" -> Size Can't Be Negative !!");
			sc.close();
			return;
		}
		sc.close();
		
		System.out.println("\nPrime Numbers Upto -> "+size);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		for(int i=2;i<=size;++i){
			if(isPrime(i)){
				System.out.print(i+",");
			}
		}
	}
	public static boolean isPrime(int num){
		if(num <= 1)
			return false;
		for(int i=2;i<=Math.sqrt(num);++i){
			if(num % i == 0){
				return false;
			}
		}
		return true;
	}
}
