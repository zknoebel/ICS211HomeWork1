import java.util.Random;

public class Main {

  public static void main(String[] args) {

    Main tester = new Main();

    tester.bigOBubTest();
    tester.bigOInsTest();
    tester.bigOSelTest();
    tester.avgTest();

  }

  ArraySort test = new ArraySort();
  CompareNumbers comp = new CompareNumbers();
  int arrayLength = 5000;
  int numberOfTests = 1000;
  Random randomGeneration = new Random();
  long avgBubComps = 0, avgBubSwaps = 0, avgBubTime = 0;
  long avgInsComps = 0, avgInsSwaps = 0, avgInsTime = 0;
  long avgSelComps = 0, avgSelSwaps = 0, avgSelTime = 0;

  Integer[] testArray;


  private void arrayBuild(int arrLength) {
    testArray = new Integer[arrLength];
    for (int j = 0; j < arrLength; j++) {
      testArray[j] = randomGeneration.nextInt(1000) * (int) Math.pow(-1, j);
    }

  }


  private void avgTest() {

    for (int i = 0; i < numberOfTests; i++) {
      arrayBuild(arrayLength);
      test.bubbleSort(testArray, comp);
      avgBubComps += test.getCompareCount();
      avgBubSwaps += test.getSwapCount();
      avgBubTime += test.getSortTime();
    }
    for (int i = 0; i < 1000; i++) {
      arrayBuild(arrayLength);
      test.insertionSort(testArray, comp);
      avgInsComps += test.getCompareCount();
      avgInsSwaps += test.getSwapCount();
      avgInsTime += test.getSortTime();
    }
    for (int i = 0; i < 1000; i++) {
      arrayBuild(arrayLength);
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


  private void bigOBubTest() {
    arrayBuild(10);
    test.bubbleSort(testArray, comp);
    test.printResults(testArray, "Bubble Sort");
    arrayBuild(100);
    test.bubbleSort(testArray, comp);
    test.printResults(testArray, "Bubble Sort");
    arrayBuild(1000);
    test.bubbleSort(testArray, comp);
    test.printResults(testArray, "Bubble Sort");
    arrayBuild(5000);
    test.bubbleSort(testArray, comp);
    test.printResults(testArray, "Bubble Sort");
  }


  private void bigOInsTest() {
    arrayBuild(10);
    test.insertionSort(testArray, comp);
    test.printResults(testArray, "Insertion Sort");
    arrayBuild(100);
    test.insertionSort(testArray, comp);
    test.printResults(testArray, "Insertion Sort");
    arrayBuild(1000);
    test.insertionSort(testArray, comp);
    test.printResults(testArray, "Insertion Sort");
    arrayBuild(5000);
    test.insertionSort(testArray, comp);
    test.printResults(testArray, "Insertion Sort");
  }


  private void bigOSelTest() {
    arrayBuild(10);
    test.selectionSort(testArray, comp);
    test.printResults(testArray, "Selection Sort");
    arrayBuild(100);
    test.selectionSort(testArray, comp);
    test.printResults(testArray, "Selection Sort");
    arrayBuild(1000);
    test.selectionSort(testArray, comp);
    test.printResults(testArray, "Selection Sort");
    arrayBuild(5000);
    test.selectionSort(testArray, comp);
    test.printResults(testArray, "Selection Sort");
  }


  void Main() {

  }
}
