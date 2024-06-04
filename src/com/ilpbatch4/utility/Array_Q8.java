package com.ilpbatch4.utility;

public class Array_Q8 {

	public static void main(String[] args) {
		int array[] = {2,1,3,2,3,1,1,2};
		array8(array);

	}

	private static void array8(int[] array) {
		for(int k=0; k < array.length - 1; k++) {
			
			for(int i=0; i < array.length - 1; i++) {
				for (int j = 0; j < array.length -1; j++) {
	                if (array[j] > array[j + 1]) {
	                    int temp = array[j];
	                    array[j] = array[j + 1];
	                    array[j + 1] = temp;
	                }
	            }
			}
		
			if (array[k] == array[k + 1]) {
                System.out.println(array[k]);
                while (k < array.length - 1 && array[k] == array[k + 1]) {
                    k++;
                }
            }
		}
	}
}
