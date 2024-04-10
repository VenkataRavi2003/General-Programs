import java.util.Scanner;
public class PerfectSquareUpToN{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("\nEnter N : ");
		int N =sc.nextInt();
		if(N<0){
			System.out.println("\n"+N+" -> Size Can't Be Negative!!");
			sc.close();
			return;
		}
		printPerfectNums(N);
		sc.close();
	}
	public static void printPerfectNums(int N){
		
		for(int i=1;i<=N;++i){
			System.out.print((i*i)+" ");
		}
	}
}