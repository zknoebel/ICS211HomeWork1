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


public class ArraySort {

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


	public ArraySort(double[] data){
		
		arrayLength = data.length;
		insertionOutput = new double[arrayLength];
		bubbleOutput = new double[arrayLength];
		selectionOutput = new double[arrayLength];

//		insertionOutput = data;
//		bubbleOutput = data;
//		selectionOutput = data;
		
		for(int i = 0; i < arrayLength; i ++){
			
			insertionOutput[i] = data[i];
			bubbleOutput[i] = data[i];
			selectionOutput[i] = data[i];
		}
	}

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


	public void bubbleSort(){
		
		startTime = System.nanoTime();
		comparisonCounter = 0;
		swapCounter = 0;
		
		for(int i = 0; i < arrayLength -1; i ++){
			
			for(int j = 0; j < arrayLength -1; j ++){
				
				x = bubbleOutput[j];
				y = bubbleOutput[j + 1];
				comparisonCounter ++;
				
				if(x > y){
					
				  swapCounter ++;
					bubbleOutput[j] = y;
					bubbleOutput[j + 1] = x;
				}
			}
		}
		
		printResults(bubbleOutput, "Bubble Sort");
	}


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


	public void printResults(double[] arrayToBePrinted, String title){
		
		System.out.println(title);
		System.out.print("The sorted array is ");
		
		for(int i = 0; i < arrayLength; i ++){
			
			System.out.print(arrayToBePrinted[i] + "  ");
		}
		
		System.out.println("");
		System.out.println("This method made " + comparisonCounter + " comparisons.");
		System.out.println("This method made " + swapCounter + " swaps.");
		System.out.println("This method took " + (System.nanoTime() - startTime) + " nano seconds to complete.");
		System.out.println("");
	}
}
