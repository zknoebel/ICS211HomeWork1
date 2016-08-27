/**
 * ArraySort
 * Copyright (C) Zachery Knoebel 2016
 */

/**
 * ArraySort: This program sorts an array with insertion sort, bubble sort and selection sort. Then it
 * prints out the sorted array along with the time and number of steps it took to do this
 *
 * @author Zachery Knoebel
 *
 */


public class ArraySort {

  private int stepCounter = 0;
  private int arrayLength;
  private int placeHolder0, placeHolder1= 0;
  private double startTime;
  private double x, y, z = 0;
  private double[] insertionOutput, bubbleOutput, selectionOutput;
  private boolean finished = false;



  public ArraySort(double[] inputArray){
    arrayLength = inputArray.length;
    insertionOutput = new double[arrayLength];
    bubbleOutput = new double[arrayLength];
    selectionOutput = new double[arrayLength];


    for(int i = 0; i < arrayLength; i ++){
      insertionOutput[i] = inputArray[i];
      bubbleOutput[i] = inputArray[i];
      selectionOutput[i] = inputArray[i];
    }

  }

  public void insertionSort(){
    startTime = System.nanoTime();
    stepCounter = 0;
    placeHolder0 = 0;

    for(int i = 0; i < arrayLength; i ++){

      x = insertionOutput[placeHolder0];
      y = insertionOutput[placeHolder0 + 1];
      
        placeHolder1 = placeHolder0;
      
      while(x > y){
        
        insertionOutput[placeHolder0] = y;
        insertionOutput[placeHolder0 + 1] = x;
        
        placeHolder0 --;
        
        x = insertionOutput[placeHolder0];
        y = insertionOutput[placeHolder0 + 1];

      }
      placeHolder0 = placeHolder1;
      placeHolder0 ++;
    }
    printResults(insertionOutput, "Insertion Sort");
  }


  public void bubbleSort(){
    startTime = System.nanoTime();
    stepCounter = 0;

    for(int i = 0; i < arrayLength -1; i ++){
      for(int j = 0; j < arrayLength -1; j ++){
        x = bubbleOutput[j];
        y = bubbleOutput[j + 1];
        stepCounter ++;
        if(x > y){
          bubbleOutput[j] = y;
          bubbleOutput[j + 1] = x;
        }
      }
    }
    printResults(bubbleOutput, "Bubble Sort");
  }


  public void selectionSort(){
    startTime = System.nanoTime();
    stepCounter = 0;


    printResults(selectionOutput, "Selection Sort");
  }


  public void printResults(double[] arrayToBePrinted, String title){
    System.out.println(title);
    System.out.print("The sorted array is ");
    for(int i = 0; i < arrayLength; i ++){
      System.out.print(arrayToBePrinted[i] + "  ");
    }
    System.out.println("");
    System.out.println("This method took " + stepCounter + " steps to complete.");
    System.out.println("This method took " + (System.nanoTime() - startTime) + " nano seconds to complete.");
    System.out.println("");
  }
}
