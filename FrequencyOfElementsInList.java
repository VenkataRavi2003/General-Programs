import java.util.List;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class FrequencyOfElementsInList {
	
	public static void main(String args[]) {
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("\nEnter the size of elements you need to keep in List : ");
			int size;
			while(true) {
				size = getValidInput(sc);
				if(size > 0)break;
				System.out.println("\n"+size+" -> size must be greater than zero! Try Again : ");
				
			}
			List<Integer> list = new ArrayList<Integer>();
			System.out.println("\nEnter the elements into list : ");
			takeInput(sc,list,size);
			System.out.println("\nResulted List : "+list);
			
			findFrequenciesOfElements(list);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static int getValidInput(Scanner sc) {
		while(true) {
			try {
				return sc.nextInt();
			}catch(InputMismatchException ime) {
				System.out.println("\nInvalid Input! Please enter valid integer as input.Try Again : ");
				sc.next();
			}
		}
	}
	public static void takeInput(Scanner sc,List<Integer> list,int size) {
		int i=0;
		while(i < size) {
			list.add(getValidInput(sc));
			i++;
		}
	}
	public static void findFrequenciesOfElements(List<Integer> list) {
		for(int i=0;i<list.size();++i) {
			int x = list.get(i);
			int count = 0;
			if(x == -1) {
				continue;
			}
			for(int j = 0; j < list.size();++j) {
				if(x == list.get(j)) {
					++count;
					list.set(j,-1);
				}
			}
			System.out.println("\n"+x+" -> Frequency Is : "+count);
		}
	}
}
