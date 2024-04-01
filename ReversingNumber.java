import java.util.Scanner;
public class ReversingNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the number : ");
		int num=sc.nextInt();
		System.out.println("\nBefore Reversing : "+num);
		int rev=reverseNum(num);
		System.out.println("\nAfter Reversing  : "+rev);
	}
	public static int reverseNum(int num){
		int temp = num;
		int rev = 0;
		while(temp!=0){
			int rem = temp%10;
			rev = (rev*10)+rem;
		    temp = temp/10;
		}
		return rev;
	}
}