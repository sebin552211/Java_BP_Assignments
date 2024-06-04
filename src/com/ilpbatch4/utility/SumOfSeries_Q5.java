package com.ilpbatch4.utility;

public class SumOfSeries_Q5 {

	public static void main(String[] args) {
		int input = 5;
		sumofseries5(input);

	}

	private static void sumofseries5(int input) {
		int sum = 0;
		int count = 1;
		for(int i=1 ; i<=input ; i++)
		{
			if(count%2==0) {
				sum = sum - ((int)Math.pow(i, count));
				i++;
				count++;
			}
			else {
				sum = sum + ((int)Math.pow(i, count));
				i++;
				count++;
			}
		}
		System.out.print(sum);
	}

}
