
public class Main {



  public static void main(String[] args){

    double[] testArray = new double[10];  
    testArray[0] = 1; 
    testArray[1] = 4;
    testArray[2] = 3.5;
    testArray[3] = 34;
    testArray[4] = 21;
    testArray[5] = 45.7;
    testArray[6] = 2;
    testArray[7] =7;
    testArray[8] = 3;
    testArray[9] = 0;

    ArraySort test = new ArraySort(testArray);

    test.bubbleSort();
    test.insertionSort();
    test.selectionSort();
  }
}
