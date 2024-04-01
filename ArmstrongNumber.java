import java.util.Scanner;
class ArmstrongNumber{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the number : ");
		int num=sc.nextInt();
		sc.close();
		int value=num;
		int sum=0;
		String temp=Integer.toString(num);
		int len=temp.length();
		while(num!=0){
			int rem=num%10;
			sum+=(int)Math.pow(rem,len);
			num/=10;
		}
		if(value==sum){
			System.out.println("\n"+value+" -> Is Armstrong Number.");
		}else{
			System.out.println("\n"+value+" -> Is Not Armstrong Number..!");
		}
	}
}
