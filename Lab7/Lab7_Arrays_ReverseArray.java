package Lab7;

/******************************************************************************

Complete reverse() method that returns a new character array containing all contents in the input argument reversed.

Ex: If the input array is:

['a', 'b', 'c']
then the returned array will be:

['c', 'b', 'a']

*******************************************************************************/

public class Lab7_Arrays_ReverseArray {
   
   // This method reverses contents of input argument arr.
   public char[] reverse(char[] arr) {
		/* Type your code here. */
		char [] newarray = new char[arr.length];
		
		for (int i = 0; i < newarray.length; i++) {
		   newarray[i] = arr[newarray.length - i - 1];
		}
		
		return newarray;
		
   }
   
   public static void main(String[] args) {
      Lab7_Arrays_ReverseArray lettersObject = new Lab7_Arrays_ReverseArray();
      char [] ch = {'a','b','c'};
      System.out.println(lettersObject.reverse(ch));  // Should print cba
   }
}

