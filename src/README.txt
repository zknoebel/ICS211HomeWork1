ArraySort

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