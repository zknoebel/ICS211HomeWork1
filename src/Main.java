import java.util.Random;

public class Main {



	public static void main(String[] args){

		int arrayLength = 50;
		Random randomGeneration = new Random();
		double[] testArray = new double[arrayLength];  
		testArray[arrayLength -1] = 0.00;
		testArray[arrayLength -2] = 0.00;
		for(int i = 0; i < arrayLength -2; i ++){
			testArray[i] = randomGeneration.nextInt(100);
		}


		ArraySort test = new ArraySort(testArray);

		test.bubbleSort();
		test.insertionSort();
		test.selectionSort();
	}
}
