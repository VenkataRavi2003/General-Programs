import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("\nEnter the size of array : ");
            int size = sc.nextInt();

            int arr[] = new int[size];

            System.out.println("\nEnter the elements into array : ");
            takeInput(arr, sc);

            System.out.println("\nBefore Removing Duplicates : ");
            printArray(arr);

            int unique[] = removeDuplicates(arr);

            System.out.println("\nAfter Removing Duplicates : ");
            printArray(unique);

        } catch (Exception e) {
            System.out.println("\nException Occurred :: " + e.getMessage());
        }
    }

    public static void takeInput(int arr[], Scanner sc) {
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = getValidInput(sc);
        }
    }

    public static int getValidInput(Scanner sc) {
        while (true) {
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid Input!! Please Enter Valid Integer As Input.");
                sc.next(); 
            }
        }
    }

    public static void printArray(int arr[]) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static int[] removeDuplicates(int arr[]) {
        Arrays.sort(arr);
        int len = 1; 

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                len++;
            }
        }

        int unique[] = new int[len];
        int index = 0;
        unique[index++] = arr[0]; 

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                unique[index++] = arr[i];
            }
        }

        return unique;
    }
}
