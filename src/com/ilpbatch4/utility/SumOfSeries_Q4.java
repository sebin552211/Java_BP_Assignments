package com.ilpbatch4.utility;

public class SumOfSeries_Q4 {

	public static void main(String[] args) {
		int limit = 5;
		sumofseries4(limit);
	}
	
	private static void sumofseries4(int limit) {
		int variable1=0, variable2=1, variable3, sum=0;
		for(int i=1; i<limit; i++)
		{
			variable3 = variable1 + variable2;
			variable1 = variable2;
			variable2 = variable3;
			int product = variable3*variable3*variable3;
			sum = sum + product;
		}
        
        System.out.println("Sum of Fibonacci series up to " + limit + " terms is: " + sum);
	}

}
