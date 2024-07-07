import java.util.Scanner;
import java.util.InputMismatchException;
public class ReverseArrayElements{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){

			System.out.print("\nEnter the size of array : ");
			int size = sc.nextInt();

			int arr[] = new int[size];

			System.out.println("\nEnter the elements into array : ");
			takeInput(arr,sc);

			System.out.println("\nBefore Reversing : ");
			printArray(arr);

			reverseArray(arr);

			System.out.println("\nAfter Reversing : ");
			printArray(arr);

		}catch (Exception e) {
		   System.out.println("\nException Occured :: "+e.getMessage());	
		}
	}
	public static void takeInput(int arr[],Scanner sc)throws Exception{

		for (int i = 0 ; i < arr.length ; ++i) {
			arr[i] = getValidInput(sc);
		}
	}
	public static int getValidInput(Scanner sc){

		while (true) {
			try{

				return sc.nextInt();

			}catch (InputMismatchException e) {
				System.out.println("\n:: Invalid Input!! Please Enter Valid Integer As Input ::");
				sc.next();
			}catch (Exception e) {
				System.out.println("\nException Occured :: "+e.getMessage());
				sc.next();
			}
		}
	}
	public static void printArray(int arr[]){
		for (int item : arr) {
			System.out.print(item+"\t");
		}
	}
	public static void reverseArray(int arr[]){

		int i = 0 , j = arr.length-1;
		while (i < j) {

			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			++i;
			--j;
		}
	}
}