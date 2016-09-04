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

	private boolean finished = false;
	private E e;
	private E[] bubbleOutput, insertionOutput, selectionOutput;
	private int placeHolder = 0;
	private long compareCount, swapCount;
	private long sortTime, startTime;

	public ArraySort(){
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
					e = bubbleOutput[j];
					bubbleOutput[j] = bubbleOutput[j + 1];
					bubbleOutput[j + 1] = e;
				}
			}

			if(finished == true){
				break;
			}
		}

		sortTime = System.nanoTime() - startTime;
		printResults(bubbleOutput, "Bubble Sort");    


	}


	public long getCompareCount(){
		return compareCount;
	}


	public long getSortTime(){
		return sortTime;
	}


	public long getSwapCount(){
		return swapCount;
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

			while(compare.compare(insertionOutput[placeHolder], insertionOutput[placeHolder + 1]) > 0){

				compareCount ++;
				swapCount ++;

				e = insertionOutput[placeHolder];
				insertionOutput[placeHolder] = insertionOutput[placeHolder + 1];
				insertionOutput[placeHolder + 1] = e;

				if(placeHolder > 0){
					placeHolder --;
				}
			}
			compareCount ++;
		}

		sortTime = System.nanoTime() - startTime;
		printResults(insertionOutput, "Insertion Sort");
	}


	/*
	 * prints out the name of the sort used, the sorted array(if uncommented), time and number of comparisons and swaps made for the
	 *  used method
	 */
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


	/*
	 * sorts an array of numbers by finding the smallest number in the array and moving it to the front
	 * then it finds the next smallest number in the array and moves it to the next spot
	 * this continues until the list is sorted
	 * @param data: the unsorted array
	 * @param compare: a comparator made for the specific type to be sorted
	 */
	public void selectionSort(E[] data, Comparator<? super E> compare){


		startTime = System.nanoTime();
		compareCount = 0;
		swapCount = 0;
		placeHolder = 0;
		selectionOutput = data.clone();

		for(int i = 0; i < selectionOutput.length -1; i ++){

			e = selectionOutput[i];
			placeHolder = i;

			for(int j = i; j < selectionOutput.length; j ++){

				compareCount ++;

				if(compare.compare(e, selectionOutput[j]) > 0){

					e = selectionOutput[j];
					swapCount ++;
					placeHolder = j;
				}
			}

			selectionOutput[placeHolder] = selectionOutput[i];
			selectionOutput[i] = e;
		}

		sortTime = System.nanoTime() - startTime;
		printResults(selectionOutput, "Selection Sort");

	}
}
