import java.util.Random;

public class Main{


  public static void main(String[] args){

    int arrayLength = 5000;
    int numberOfTests = 1000;
    Random randomGeneration = new Random();
    Integer[] testArray = new Integer[arrayLength];  
    long avgBubComps = 0, avgBubSwaps = 0, avgBubTime = 0;
    long avgInsComps = 0, avgInsSwaps = 0, avgInsTime = 0;
    long avgSelComps = 0, avgSelSwaps = 0, avgSelTime = 0;

    CompareNumbers comp = new CompareNumbers();

    ArraySort test = new ArraySort();

    for(int i  = 0; i < numberOfTests; i ++){
      for(int j = 0; j < arrayLength; j ++){
        testArray[j] = randomGeneration.nextInt(999) * (int)Math.pow(-1, i);
      }
      test.bubbleSort(testArray, comp);
      avgBubComps += test.getCompareCount();
      avgBubSwaps += test.getSwapCount();
      avgBubTime += test.getSortTime();
    }
    for(int i  = 0; i < 1000; i ++){
      for(int j = 0; j < arrayLength; j ++){
        testArray[j] = randomGeneration.nextInt(999) * (int)Math.pow(-1, i);
      }
      test.insertionSort(testArray, comp);
      avgInsComps += test.getCompareCount();
      avgInsSwaps += test.getSwapCount();
      avgInsTime += test.getSortTime();
    }
    for(int i  = 0; i < 1000; i ++){
      for(int j = 0; j < arrayLength; j ++){
        testArray[j] = randomGeneration.nextInt(999) * (int)Math.pow(-1, i);
      }
      test.selectionSort(testArray, comp);
      avgSelComps += test.getCompareCount();
      avgSelSwaps += test.getSwapCount();
      avgSelTime += test.getSortTime();
    }

    System.out.println("Bubble Sort");
    System.out.println("Average number of comparisons: " + avgBubComps / numberOfTests);
    System.out.println("Average number of swaps: " + avgBubSwaps / numberOfTests);
    System.out.println("Average sort time: " + avgBubTime / numberOfTests + " nano Seconds");
    System.out.println("");
    System.out.println("Insertion Sort");
    System.out.println("Average number of comparisons: " + avgInsComps / numberOfTests);
    System.out.println("Average number of swaps: " + avgInsSwaps / numberOfTests);
    System.out.println("Average sort time: " + avgInsTime / numberOfTests + " nano Seconds");
    System.out.println("");
    System.out.println("Selection Sort");
    System.out.println("Average number of comparisons: " + avgSelComps / numberOfTests);
    System.out.println("Average number of swaps: " + avgSelSwaps / numberOfTests);
    System.out.println("Average sort time: " + avgSelTime / numberOfTests + " nano Seconds");
    System.out.println("");
  }
}
