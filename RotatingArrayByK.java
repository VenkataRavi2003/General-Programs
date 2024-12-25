import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Arrays;
public class RotatingArrayByK{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){

			System.out.print("\nEnter the size of array : ");
			int size;

			while (true) {
				size = getValidInput(sc);
				if(size > 0)break;
				System.out.println("\n"+size+" -> Array size must be greater than zero.");
			}

			int arr[] = new int[size];

			System.out.println("\nEnter the elements : ");
			takeInput(arr,sc);

			System.out.println("\nBefore Rotating : "+Arrays.toString(arr));

			System.out.print("\nEnter K :");
			int k = getValidInput(sc);

			rotateArrayByK(arr,k);

			System.out.println("\nAfter Rotating : "+Arrays.toString(arr));

		}catch (Exception e) {
			e.printStackTrace();
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
				System.out.println("\nInvalid Input!Please Enter Valid Integer As Input.");
				sc.next();
			}
		}
	}
	public static void rotateArrayByK(int arr[],int k){
		int n = arr.length;
		k = k % n;
		int rotated[] = new int[n];

		for (int i = 0 ; i < n ; ++i) {
			rotated[(i + k) % n] = arr[i];
		}

		for (int i = 0 ; i < n ; ++i) {
			arr[i] = rotated[i];
		}
	}
}