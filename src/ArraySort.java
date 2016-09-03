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
public class ArraySort<E>{

  private int comparisonCounter = 0;
  private int swapCounter  = 0;
  private int arrayLength;
  private int placeHolder = 0;
  private long startTime;
  private double x, y = 0;
  private long compareCount;
  private long swapCount;
  private long sortTime;
  private boolean finished = false;
  private E a, b;
  private E[] bubbleOutput, insertionOutput, selectionOutput;
  
  public ArraySort(){
  }


  /*
   * sorts an array by looking at a number in an unsorted array and then moving it to it's numerically sorted spot
   * then it moves to the next number in the array and does the same over and over again until it gets to the end 
   * of the list
   * @param data: the unsorted array
   * @param compare: a comparator made for the specific type to be sorted
   */
  public void insertionSort(E[] data, Comparator<? super E> compare){

	  	sortTime = 0;
	    startTime = System.nanoTime();
	    compareCount = 0;
	    swapCount = 0;
	    insertionOutput = data.clone();
	
	    for(int i = 0; i < insertionOutput.length -1; i ++){
	
	      placeHolder = i;
	
	      if(compare.compare(insertionOutput[i], insertionOutput[i + 1]) <= 0){
	        compareCount ++;
	      }
	
	      while(compare.compare(insertionOutput[placeHolder], insertionOutput[placeHolder + 1]) > 0){
	
	        compareCount ++;
	        swapCount ++;
	        
	        a = insertionOutput[placeHolder];
	        insertionOutput[placeHolder] = insertionOutput[placeHolder + 1];
	        insertionOutput[placeHolder + 1] = a;
	
	        if(placeHolder > 0){
	          placeHolder --;
	        }
	      }
	    }
	    
	    sortTime = System.nanoTime() - startTime;
	    printResults(insertionOutput, "Insertion Sort");
  }


  /*
   * sorts an array of numbers by "sinking" the large numbers to the "bottom" or end of the list
   *  and "bubbling" the small numbers to the "top" or front of the list
   * @param data: the unsorted array
   * @param compare: a comparator made for the specific type to be sorted
   */
  public void bubbleSort(E[] data, Comparator<? super E> compare){

	sortTime = 0;
    startTime = System.nanoTime();
    compareCount = 0;
    swapCount = 0;
    bubbleOutput = data.clone();

    for(int i = 0; i < bubbleOutput.length -1; i ++){

      finished = true;

      for(int j = 0; j < bubbleOutput.length -1 - i; j ++){

        compareCount ++;

        if(compare.compare(bubbleOutput[j], bubbleOutput[j + 1]) > 0){

          finished = false;
          swapCount ++;
          a = bubbleOutput[j];
          bubbleOutput[j] = bubbleOutput[j + 1];
          bubbleOutput[j + 1] = a;
        }
      }

      if(finished == true){
    	  break;
      }
    }
    
    sortTime = System.nanoTime() - startTime;
    printResults(bubbleOutput, "Bubble Sort");    
    
    
  }

  /*
   * sorts an array of numbers by finding the smallest number in the array and moving it to the front
   * then it finds the next smallest number in the array and moves it to the next spot
   * this continues until the list is sorted
   * @param data: the unsorted array
   * @param compare: a comparator made for the specific type to be sorted
   */
//  public void selectionSort(){
//
//    startTime = System.nanoTime();
//    comparisonCounter = 0;
//    swapCounter = 0;
//    placeHolder = 0;
//
//    for(int i = 0; i < arrayLength -1; i ++){
//
//      x = selectionOutput[i];
//      y = selectionOutput[i];
//      placeHolder = i;
//
//      for(int j = i; j < arrayLength; j ++){
//
//        comparisonCounter ++;
//
//        if(y > selectionOutput[j]){
//
//          y = selectionOutput[j];
//          swapCounter ++;
//          placeHolder = j;
//        }
//      }
//
//      selectionOutput[i] = y;
//      selectionOutput[placeHolder] = x;
//    }
//
//    printResults(selectionOutput, "Selection Sort");
//  }


  public void selectionSort(E[] data, Comparator<? super E> compare){

	  

	    sortTime = System.nanoTime() - startTime;
  }

  /*
   * prints out the name of the sort used, the sorted array, time and number of comparisons and swaps made for the used method
   */
//  public void printResults(double[] arrayToBePrinted, String title){
    public void printResults(E[] arrayToBePrinted, String title){

    System.out.println(title);
    System.out.print("The sorted array is ");

    for(int i = 0; i < arrayToBePrinted.length; i ++){

      System.out.print(arrayToBePrinted[i] + "  ");
    }

    System.out.println("");
    System.out.println("This method made " + compareCount + " comparisons.");
    System.out.println("This method made " + swapCount + " swaps.");
    System.out.println("This method took " + sortTime + " nano seconds to complete.");    
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
