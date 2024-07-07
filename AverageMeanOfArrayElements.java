import java.util.Scanner;
import java.util.InputMismatchException;
public class AverageMeanOfArrayElements{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){

			System.out.print("\nEnter the size of array : ");
			int size = sc.nextInt();

			float arr[] = new float[size];

			System.out.println("\nEnter the elements into array : ");
			takeInput(arr,sc);

			System.out.println("\nResulted Array :: ");
			printArray(arr);

			float averageMean = findAverageMean(arr);

			System.out.println("\nAverage Mean = "+averageMean);

		}catch (Exception e) {
			System.out.println("\nException Occured :: "+e.getMessage());
		}
	}
	public static void takeInput(float arr[],Scanner sc){
		for (int i = 0 ; i < arr.length ; ++i) {
			arr[i] = getValidInput(sc);
		}
	}
	public static float getValidInput(Scanner sc){
		while (true) {
			try{

				return sc.nextFloat();

			}catch (InputMismatchException e) {

				System.out.println("\nInvalid Input!! Please enter valid input.");
				sc.next();
			}
		}
	}
	public static void printArray(float arr[]){
		for (float item : arr) {
			System.out.print(item+"\t");
		}
	}
	public static float findAverageMean(float arr[]){
		float sum = 0.0f;

		for (float item : arr) {
			sum += item;
		}

		return sum / arr.length;
	}
}