package telran.arrays;

import java.util.Arrays;

public class MyArraysInt {
       public static int[] addNumber(int[]array,int num) {
    	   //TODO
    	   //Adds num at the array's end
    	   //Return new array with added number
    	   //using standard method Arrays.copyof
    	   int []newArr = Arrays.copyOf(array, array.length+1);
    	          newArr[array.length] = num;
    	   return newArr;
       }
       public static int[] removeNumber(int[]array , int index) {
    	   //TODO 
    	   //Remove elements at a given index for right index value {0 - array.length-1) and return 
    	   //new array with no remove one
    	   //Returns the source array if for a wrong index value (less than 0 or greater than array.length -1 )
    	    //using standard method System.arraycopy
//    	   int s[] = {5,10,3,'2',20};
    	  
    	  if (index >= 0 && index <= array.length-1) {
    	  int []newArr = new int[array.length-1];
    	  System.arraycopy(array, 0, newArr, 0, index);
  		  System.arraycopy(array, index+1, newArr, index, (array.length-1)-index);
  		    array = newArr;
    	  }
    	   return array;
       }
       
       public static int[] insertNumber(int[]array,int index, int num) {
    	   //TODO 
    	   //Insert a given num at a given index for right value of the index [0 - array.length] 
    	   //and returns new array with the inserted number
    	   //return the source array for a wrong index value (less than 0 or greater than array.length)
    	   //using standard method System.arraycopy
    	   
//    	   int s[] = {1,2,3,4,5,6,7,8};
    	  if (index >= 0 && index <= array.length) {
    	  int []newArr = new int[array.length+1];
    	  System.arraycopy(array, 0, newArr, 0, index);
  		  System.arraycopy(array, index, newArr, index+1, array.length - index);
  		  newArr[index]= num;
  		   array = newArr;
    	  }
    	   return array;
       }
}
