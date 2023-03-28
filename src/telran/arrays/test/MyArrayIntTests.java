package telran.arrays.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import static telran.arrays.MyArraysInt.*;

class MyArrayIntTests {

	@Test
	void testAddNumber() {
		int array[] =     {1,2,3,4,5,6,7};
		int expected1[] = {1,2,3,4,5,6,7,8};
		
		assertArrayEquals(expected1, addNumber(array, 8));
		
	}

	@Test
	void testRemoveNumber() {
		int array[] = {1,2,3,4,5,6,7};
		int expected1[] = {1,2,3,4,5,6};
		int expected2[] = {1,2,3,4,6,7};
		int expected3[] = {1,3,4,5,6,7};
		assertArrayEquals(expected1, removeNumber(array, 6));
		assertArrayEquals(expected2, removeNumber(array, 4));
		assertArrayEquals(expected3, removeNumber(array, 1));
		assertArrayEquals(array, removeNumber(array, -1));
		assertArrayEquals(array, removeNumber(array, 8));




	}

	@Test
	void testInsertNumber() {
		int array[] = {1,2,3,4,5,6,7};
		int expected1[] = {1,2,3,4,5,7};
		int expected2[] = {1,2,3,4,6,7};
		int expected3[] = {1,3,4,5,6,7};
		assertArrayEquals(array, insertNumber(expected1,5, 6));
		assertArrayEquals(array, insertNumber(expected2, 4, 5));
		assertArrayEquals(array, insertNumber(expected3, 1, 2));
		assertArrayEquals(array, insertNumber(array, -1, 50));
		assertArrayEquals(array, insertNumber(array, 8, 77));


	}
	@Test
	void testCopyOf() {
		int array[] = {1,2,3};
		int expected1[] = {1,2,3};
		int expected2[] = {1};
		int expected3[] = {1,2,3,0,0,0};
		assertArrayEquals(expected1, Arrays.copyOf(array, array.length));
		assertArrayEquals(expected2, Arrays.copyOf(array, 1));
		assertArrayEquals(expected3, Arrays.copyOf(array, 6));
	}
	@Test
	void testArrayCopy() {
		int array[] = {1,2,3};
		int expected[] = {5,10,1,2,20};
		int arrayDest[] = new int [5];
		int array1[] = {2,5,10};
		System.arraycopy(array, 0, arrayDest, 2, 2);
		System.arraycopy(array1, 1, arrayDest, 0, 2);
		arrayDest[4] = 20;
		assertArrayEquals(expected, arrayDest);
	}
	@Test
	void testBinarySearchInt() {
		//Arrays.binarySearch(int[] array, int number)
		//TODO
		int array[] = {1,2,3,4,5,6,7};
		int expected1[] = {1,2,4,5,6,50};
		int expected2[] = {1,2,3,4,6,7};
		int expected3[] = {1,3,4,5,6,7};
		assertEquals(5,Arrays.binarySearch(array, 6) );
		assertEquals(5,Arrays.binarySearch(expected1, 50));
		assertEquals(3,Arrays.binarySearch(expected2, 4) );
		assertEquals(0,Arrays.binarySearch(expected3, 1 ) );

		
	}

}
