import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.InputMismatchException;
public class RowWiseSumInMatrix{
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("\nEnter no.of rows & columns :");
			int rows,cols;
			while (true) {
				rows = sc.nextInt();
				cols = sc.nextInt();
				if(rows > 0 && cols >0)
					break;
				System.out.println("\nrows & columns must be greater than zero!!");
			}

			List<List<Integer>> matrix = new ArrayList();
			System.out.println("\nenter the elements : ");
			takeInput(matrix,rows,cols,sc);

			System.out.println("\n:: Resulted Matrix ::");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
			printMatrix(matrix);

			System.out.println("\nRow Wise Sums : ");
			System.out.println("~~~~~~~~~~~~~~~~~~~~");
			findRowWiseSum(matrix,rows,cols);

		}catch (Exception e) {
			System.out.println("\nException Occured:: "+e.getMessage());
		}
	}
	public static void takeInput(List<List<Integer>> matrix,int rows,int cols,Scanner sc){
		for (int i=0;i<rows ; ++i) {
			List<Integer> row = new ArrayList();
			for (int j=0;j<cols;++j) {
				row.add(getValidInput(sc));
			}
			matrix.add(row);
		}
	}
	public static int getValidInput(Scanner sc){
		while (true) {
			try{
				return sc.nextInt();
			}catch (InputMismatchException e) {
				System.out.println("\nInvalid input!please enter valid integer as input.");
				sc.next();
			}
		}
	}
	public static void printMatrix(List<List<Integer>> matrix){
		for(List<Integer> row : matrix){
			for (Integer  item: row) {
				System.out.print(item+"\t");
			}
			System.out.println();
		}
	}
	public static void findRowWiseSum(List<List<Integer>> matrix,int rows,int cols){

		for (int i=0;i<rows ; ++i) {
			int sum = 0;

			for (int j=0;j<cols ; ++j) {
				sum += matrix.get(i).get(j);
			}

			System.out.println("\n"+i+" -> row sum : "+sum);
		}
	}
}