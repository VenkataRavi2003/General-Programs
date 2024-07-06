import java.util.Scanner;
import java.util.InputMismatchException;
public class CompareTwoArrays{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){

			System.out.print("\nEnter 1st array size : ");
			int size1 = sc.nextInt();

			int arr1[] = new int[size1];
			System.out.println("\nEnter 1st array elements : ");

			takeInput(arr1,sc);

			System.out.print("\nEnter 2nd array size : ");
			int size2 = sc.nextInt();

			int arr2[] = new int[size2];
			System.out.println("\nEnter 2nd array elements : ");
			takeInput(arr2,sc);

			System.out.println("\n1st Array : ");
			printArray(arr1);

			System.out.println("\n2nd Array : ");
			printArray(arr2);

			if(compareTwoArraysEqualOrNot(arr1,arr2)){
				System.out.println("\nBoth Arrays consists of same elements.");
			}else {
				System.out.println("\nBoth Arrays Are Different!!");
			}

		}catch (Exception e) {
			System.out.println("\nException Occured :: "+e.getMessage());
		}
	}
	public static void takeInput(int arr[],Scanner sc){

		for (int i = 0 ; i < arr.length ; ++i) {
			
			arr[i] = getValidInput(sc);
		}
	}
	public static int getValidInput(Scanner sc){

		while (true) {
			try{
				return sc.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("\nInvalid Input! Please Enter Valid Integer As Input.");
				sc.next();
			}catch (Exception e) {
				System.out.println("\nException Occured :: "+e.getMessage());
				sc.next();
			}
		}
	}
	public static void printArray(int arr[]){
		for (int item : arr) {
			System.out.print(item+" ");
		}
	}
	public static boolean compareTwoArraysEqualOrNot(int arr1[],int arr2[]){

		if(arr1.length != arr2.length)return false;

		for (int i = 0 ; i < arr1.length ; ++i) {
			if(arr1[i] != arr2[i]){
				return false;
			}
		}
		return true;
	}
}