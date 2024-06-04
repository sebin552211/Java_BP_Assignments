package com.ilpbatch4.utility;

public class SumOfSeries_Q3 {

	public static void main(String[] args) {
		int input = 10;
		sumofseries3(input);

	}

	private static void sumofseries3(int input) {
		int sum = 0;
		int count = 1;
		for(int i=1 ; i<=input ; i++)
		{
			if(count%2==0) {
				sum = sum - i;
				i++;
				count++;
			}
			else {
				sum = sum + i;
				i++;
				count++;
			}
		}
		System.out.print(sum);
	}

}
