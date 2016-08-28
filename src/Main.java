import java.util.Random;

public class Main {



	public static void main(String[] args){

		int arrayLength = 50;
		Random randomGeneration = new Random();
		double[] testArray = new double[arrayLength];  
		testArray[arrayLength -1] = -99.99;
		testArray[arrayLength -2] = (float)-3.02540001;
		for(int i = 0; i < arrayLength -2; i ++){
			testArray[i] = randomGeneration.nextInt(100);
		}


		ArraySort test = new ArraySort(testArray);

		test.bubbleSort();
		test.insertionSort();
		test.selectionSort();
	}
}
