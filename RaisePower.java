package normalPrograms;
import java.util.Scanner;
public class RaisePower {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			System.out.print("\nEnter a : ");
			int a = sc.nextInt();
			System.out.print("\nEnter b : ");
			int b = sc.nextInt();
			
			int res = find_A_Power_B(a,b);
			System.out.println("\nResult : "+res);
		} catch (Exception e) {
			System.out.println("\nException Occured : "+e.getMessage());
		}
	}
	public static int find_A_Power_B(int a,int b) {
		int res = 1;
		for (int i = 1; i <= b; i++) {
			res *= a;
		}
		return res;
	}
}
