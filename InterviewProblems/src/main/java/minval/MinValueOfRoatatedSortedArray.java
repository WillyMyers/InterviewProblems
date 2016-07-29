package main.java.minval;

import java.util.Arrays;

/**
 * A sorted array has been rotated so that the elements might appear in the
 * order 3 4 5 6 7 1 2. How would you find the minimum element? (You may assume that
 * the array has unique elements)
 * 
 * @author willy
 *
 */
public class MinValueOfRoatatedSortedArray<T extends Comparable<T>> {

	public T findMin(T[] tArray) throws MinValueOfRoatatedSortedArrayException {
		if(tArray == null){
			throw new MinValueOfRoatatedSortedArrayException("Passed in array is null");
		}
		if(tArray.length == 0){
			throw new MinValueOfRoatatedSortedArrayException("Passed in array is empty");
		}
		if(tArray.length == 1){
			return tArray[0];
		}
		if(tArray.length == 2){
			return tArray[0].compareTo(tArray[1]) == -1? tArray[0]: tArray[1];
		}
		
		T left = tArray[0];
		T mid = tArray[tArray.length / 2];
		
		if(left.compareTo(mid) == 1){
			return findMin(Arrays.copyOfRange(tArray, 0, (tArray.length / 2) + 1));
		}else{
			return findMin(Arrays.copyOfRange(tArray, tArray.length / 2, tArray.length));
		}
	}
}
