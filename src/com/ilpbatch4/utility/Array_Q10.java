package com.ilpbatch4.utility;

public class Array_Q10 {

	public static void main(String[] args) {
		int array[] = { 2, 4, 5, 1, 3, 3 };
		int number = 6;
		array10(array, number);

	}

	private static void array10(int[] array, int number) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] + array[j] == 6) {
					count++;
				}
			}
		}
		System.out.println("Number of Pair : " + count);
		
	}

}
