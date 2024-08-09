import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Arrays;
public class BinarySearching{
	public static void main(String args[]){
		try(Scanner sc = new Scanner(System.in)){

			System.out.print("\nEnter the size of array : ");
			int size = sc.nextInt();

			if(size <= 0){
				System.out.println("\n"+size+" -> must be greater than zero!!");
				return;
			}

			int arr[] = new int[size];
			System.out.println("\nEnter the elements : ");
			takeInput(arr,sc);

			Arrays.sort(arr);
			System.out.println("\nResulted Array After Sorting : ");
			printArray(arr);

			System.out.print("\nEnter the target element : ");
			int targetElement = sc.nextInt();

			int index = binarySearch(arr,targetElement);

			if(index != -1){
				System.out.println("\n"+targetElement+" -> Found at : "+index+" index.");
			}else {
				System.out.println("\n"+targetElement+" -> Not Found!!");
			}

		}catch (Exception e) {
			System.out.println("\nException Occured :: "+e.getMessage());
		}
	}
	public static void takeInput(int arr[],Scanner sc){
		for (int i = 0 ; i < arr.length ; ++i) {
			arr[i] = getValidIntput(sc);
		}
	}
	public static int getValidIntput(Scanner sc){
		while (true) {
			try{
				return sc.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("\nInvalid input! please enter valid integer as input.");
				sc.next();
			}
		}
	}
	public static void printArray(int arr[]){
		for (int item : arr) {
			System.out.print(item+" ");
		}
	}
	public static int binarySearch(int arr[],int targetElement){
		int start = 0 , end = arr.length - 1, mid = -1;

		while (start <= end) {

			mid = (start + end) / 2;

			if(arr[mid] == targetElement){
				return mid;
			}else if (arr[mid] < targetElement) {
				start = mid + 1;
			}else {
				end = mid - 1;
			}
		}
		return -1;
	}
}