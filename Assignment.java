
import java.util.Random;
public class Assignment {
	
	public static void main(String[] args) {
		int[] array = makeRandomIntArray(50);
		printArr(array);
		
	
		
	}
	
	/** Write a linear search method that takes an array and  a search value.
	 * It will return the index of the searched value or -1 if it is not found. 
	 * Call method using the array in the main method
	 */
	
	
	
	/** Write a binary search method that takes an array and a search value.
	 * It will return the index of the searched value or -1 if it is not found. 
	 * Call the method using the array in the main method
	 */
	
	
	
	public static int[] makeRandomIntArray(int length) {
        int[] randomArray = new int[length];
        Random random = new Random();

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(length) + 1; // Generate random numbers between 1 and 1000
        }
        return randomArray;
	}
	
	public static void printArr(int[] array) {
		System.out.print("[");
		for(int elem : array) {
			System.out.print(elem + ", ");
		}
		System.out.println("]");
	}


}
