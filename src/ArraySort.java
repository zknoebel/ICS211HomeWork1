import java.util.Comparator;

/**
 * ArraySort
 * Copyright (C) Zachery Knoebel 2016
 */

/*
 * ArraySort: This program sorts an array with insertion sort, bubble sort and selection sort. Then it
 * prints out the sorted array along with the time and number of steps it took to do this
 *
 * @author Zachery Knoebel
 *
 */


public class ArraySort<E> implements Comparator<E>{

  /*
   * The stepCounter integer and the printed value of "This method took... steps to complete" is referring to the number
   * of comparisons made between numbers in the arrays being sorted.
   */

  private int comparisonCounter = 0;
  private int swapCounter  = 0;
  private int arrayLength;
  private int placeHolder = 0;
  private double startTime;
  private double x, y = 0;
  private double[] insertionOutput, bubbleOutput, selectionOutput;
  private long compareCount;
  private long swapCount;
  private long sortTime;
  private boolean finished = false;
  private E a, b;


  public ArraySort(double[] data){

    arrayLength = data.length;
    insertionOutput = new double[arrayLength];
    bubbleOutput = new double[arrayLength];
    selectionOutput = new double[arrayLength];

    for(int i = 0; i < arrayLength; i ++){

      insertionOutput[i] = data[i];
      bubbleOutput[i] = data[i];
      selectionOutput[i] = data[i];
    }
  }

  public int compare(E imput0, E imput1){

    return this.compare(imput0, imput1);
  }

  /*
   * sorts and array by looking at a number in an unsorted list and then moving it to it's numerically sorted spot
   */
  public void insertionSort(){

    startTime = System.nanoTime();
    comparisonCounter = 0;
    swapCounter = 0;

    for(int i = 0; i < arrayLength -1; i ++){

      x = insertionOutput[i];
      y = insertionOutput[i + 1];
      placeHolder = i;

      if(x < y){
        comparisonCounter ++;
      }

      while(x > y){

        comparisonCounter ++;
        insertionOutput[placeHolder] = y;
        insertionOutput[placeHolder + 1] = x;
        swapCounter ++;

        if(placeHolder > 0){
          placeHolder --;
        }

        x = insertionOutput[placeHolder];
        y = insertionOutput[placeHolder + 1];

      }
    }
    printResults(insertionOutput, "Insertion Sort");
  }


  public void insertionSort(E[] data, Comparator<? super E> compare){

  }


  /*
   * sorts an array of numbers by "sinking" the large numbers to the "bottom" or end of the list
   *  and "bubbling" the small numbers to the "top" or front of the list
   */
  public void bubbleSort(){

    startTime = System.nanoTime();
    comparisonCounter = 0;
    swapCounter = 0;

    for(int i = 0; i < arrayLength -1; i ++){

      finished = true;

      for(int j = 0; j < arrayLength -1 - i; j ++){

        x = bubbleOutput[j];
        y = bubbleOutput[j + 1];
        comparisonCounter ++;

        if(x > y){

          finished = false;
          swapCounter ++;
          bubbleOutput[j] = y;
          bubbleOutput[j + 1] = x;
        }
      }

      if(finished == true){
        i = arrayLength;
      }
    }

    printResults(bubbleOutput, "Bubble Sort");
  }


  public void BubbleSort(E[] data, Comparator<? super E> compare){


    startTime = System.nanoTime();
    comparisonCounter = 0;
    swapCounter = 0;

    for(int i = 0; i < data.length -1; i ++){

      finished = true;

      for(int j = 0; j < data.length -1 - i; j ++){

        a = data[j];
        b = data[j + 1];
        comparisonCounter ++;

        if(compare.compare(a, b) > 0){

          finished = false;
          swapCounter ++;
          data[j] = b;
          data[j + 1] = a;
        }
      }

      if(finished == true){
        i = data.length;
      }
    }

    printResults(data, "Bubble Sort");    
    
    
  }

  /*
   * sorts an array of numbers by finding the smallest number in the array and moving it to the front
   * then it finds the next smallest number in the array and moves it to the next spot
   * this continues until the list is sorted
   */
  public void selectionSort(){

    startTime = System.nanoTime();
    comparisonCounter = 0;
    swapCounter = 0;
    placeHolder = 0;

    for(int i = 0; i < arrayLength -1; i ++){

      x = selectionOutput[i];
      y = selectionOutput[i];
      placeHolder = i;

      for(int j = i; j < arrayLength; j ++){

        comparisonCounter ++;

        if(y > selectionOutput[j]){

          y = selectionOutput[j];
          swapCounter ++;
          placeHolder = j;
        }
      }

      selectionOutput[i] = y;
      selectionOutput[placeHolder] = x;
    }

    printResults(selectionOutput, "Selection Sort");
  }


  public void selectionSort(E[] data, Comparator<? super E> compare){

  }

  /*
   * prints out the name of the sort used, the sorted array, time and number of comparisons and swaps made for the used method
   */
  public void printResults(double[] arrayToBePrinted, String title){
//    public void printResults(E[] arrayToBePrinted, String title){

    System.out.println(title);
    System.out.print("The sorted array is ");

    for(int i = 0; i < arrayLength; i ++){

      System.out.print(arrayToBePrinted[i] + "  ");
    }

    System.out.println("");
//    System.out.println("This method made " + getCompareCount() + " comparisons.");
    System.out.println("This method made " + comparisonCounter + " comparisons.");
//    System.out.println("This method made " + getSwapCount() + " swaps.");
    System.out.println("This method made " + swapCounter + " swaps.");
//    System.out.println("This method took " + (getSortTime()) + " nano seconds to complete.");    
    System.out.println("This method took " + (System.nanoTime() - startTime) + " nano seconds to complete.");
    System.out.println("");
  }

  public long getSortTime(){
    return sortTime;
  }

  public long getCompareCount(){
    return compareCount;
  }
  
  public long getSwapCount(){
    return swapCount;
  }
}
