import java.util.Random;

public class Main{


	public static void main(String[] args){

		int arrayLength = 5000;
		Random randomGeneration = new Random();
		Integer[] testArray = new Integer[arrayLength];  
		
		for(int i = 0; i < arrayLength; i ++){
			testArray[i] = randomGeneration.nextInt(999);
		}
		
		CompareNumbers comp = new CompareNumbers();

		ArraySort test = new ArraySort();
		
		test.bubbleSort(testArray, comp);
		test.insertionSort(testArray, comp);
//		test.selectionSort(testArray, comp);
	}
}
