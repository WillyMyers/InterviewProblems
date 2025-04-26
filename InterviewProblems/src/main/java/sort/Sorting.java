package main.java.sort;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		int[] arr = new int[]{78,5,89,41,23,56,14,52,36,62,1,9,4,3};
		
		bubbleSort(arr);
		printContents("BubbleSort", arr);
		arr = new int[]{78,5,89,41,23,56,14,52,36,62,1,9,4,3};
		
		selectionSort(arr);
		printContents("SelectionSort", arr);

		arr = new int[]{78,5,89,41,23,56,14,52,36,62,1,9,4,3};
		
		bubbleSortWithFlag(arr);
		printContents("BubbleSortWithFlag", arr);
	}

	private static int[] selectionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int minIdx = i;
			for (int j = i; j < arr.length; j++) {
				if(arr[j] < arr[minIdx]){
					minIdx = j;
				}	
			}
			if(arr[minIdx] < arr[i]){
				int tmp = arr[minIdx];
				arr[minIdx] = arr[i];
				arr[i] = tmp;
			}
		}
		return arr;
	}

	private static int[] bubbleSort(int[] arr) {
		for (int i = arr.length-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if(arr[j] > arr[i]){
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}				
			}
		}
		return arr;
	}
	
	private static void bubbleSortWithFlag(int[] arr){
		boolean cont = true;
		while(cont){
			cont = false;
			for (int i = 0; i < arr.length -1; i++) {
				if(arr[i] > arr[i+1]){
					cont = true;
					int tmp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = tmp;
				}	
			}	
		}
	}

	private static void printContents(String type, int[] arr){
		System.out.println(type + " : " + Arrays.toString(arr));
	}
}
