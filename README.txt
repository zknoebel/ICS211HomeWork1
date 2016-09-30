ArraySort

@author Zachery Knoebel

Runtime analysis 

BUBBLE SORT
Best Case:O(n)
	All numbers are already in order. The program checks each number, recognizes that there are already in order and stops.
Worst Case: O(n^2)
	Numbers are in reverse order. The program checks each number and performs a swap every time. Each time starting at one number
	further down the line.

INSERTION SORT
Best Case:O(n)
	All numbers are already in order. The program checks each number, recognizes that it is already in the correct spot and moves on
	to the next number, performing the minimum number of comparisons and swaps. 
Worst Case: O(n^2)
	Numbers are in reverse order. The program swaps numbers until it reaches the beginning each time.

SELECTION SORT
Best Case: O(n^2)
Worst Case: O(n^2)
	Best Case and Worst Case scenarios are the same. The program will always go through all of the numbers and make one swap at the end,
	each time starting one number further down the line.
	
OVERALL ANALYSIS
	The bubble and insertion sorts both have the same potential for shortest run time during a best case scenario, however the selection
	sort will typically run faster, because on average it will not have to perform as many swaps as the other two.
	
	After running the "bigO" methods in the main method, the fact that the "big O" of each sort is n^2 is quite apparent.
	As each array length is raised by one power of ten, the run times increase by about two powers of ten (take about 100 times longer).
	
	After running the avgTest method (average run time test) in the main method. It shows that Bubble Sort is typically the least 
	efficient, Insertion Sort is in the middle and Selection sort is the most efficient. 
	The avtTest runs the sorts on an array of length 5000, 1000 times each with a new random array each time, the average run times came
	out to be...
	
	Bubble sort:    1.331 seconds
	
	Insertion sort: 0.549 seconds
	
	Selection sort: 0.259 seconds
	
	
	To answer the question; What if the arrays have null in them? The program will give an error of null pointer exception. In this
	program, that is fine, because the arrays are not supposed to have null values.