import java.util.Scanner;
class DuckNumberOrNot{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter the number : ");
		int num=sc.nextInt();
		String temp=Integer.toString(num);
		if(isDuckNumber(temp)){
			System.out.println("\n"+num+" -> Is Duck Number.");
		}else{
			System.out.println("\n"+num+" -> Is Not A Duck Number..!");
		}
	}
	public static boolean isDuckNumber(String temp){
		if(temp.startsWith("0")){
			return false;
		}
		if(temp.contains("0")){
			return true;
		}
		return false;
	}
}
