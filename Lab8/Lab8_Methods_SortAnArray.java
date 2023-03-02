package Lab8;

import java.util.Scanner;

/******************************************************************************

Define a method named sortArray that takes an array of integers and the number of elements in the array as parameters. Method sortArray() modifies the array parameter by sorting the elements in descending order (highest to lowest). Then write a main program that reads a list of integers from input, stores the integers in an array, calls sortArray(), and outputs the sorted array. The first input integer indicates how many numbers are in the list. Assume that the list will always contain less than 20 integers.

Ex: If the input is:

5 10 4 39 12 2
the output is:

39,12,10,4,2,
For coding simplicity, follow every output value by a comma, including the last one.

Your program must define and call the following method:
public static void sortArray(int[] myArr, int arrSize)

Hint: Sorting an array can be done in many ways. You are welcome to look up and use any existing algorithm. Some believe the simplest to code is bubble sort: https://en.wikipedia.org/wiki/Bubble_sort. But you are welcome to try others: https://en.wikipedia.org/wiki/Sorting_algorithm.

*******************************************************************************/

public class Lab8_Methods_SortAnArray {

   /* Define your method here */
         
    public static void sortArray (int arr[], int arrSize)
    {
        int n = arrSize;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] < arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
         
         for (int i = 0; i < n; i++)
            System.out.print(arr[i] + ",");
    }
         
   public static void main(String[] args) {
      /* Type your code here. */
      Scanner scnr = new Scanner(System.in);
      int temp = scnr.nextInt();
      
      int[] array = new int[temp + 1];
      
      for (int i = 0; i < temp; i++) {
         array[i] = scnr.nextInt();  
      }
      
      sortArray(array, temp);
      System.out.println("");
   }
}


