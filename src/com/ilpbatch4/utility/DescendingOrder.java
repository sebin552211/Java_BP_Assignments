package com.ilpbatch4.utility;

public class DescendingOrder {

	public static void main(String[] args) {
		int input1=12, input2=42, input3=64;
		descendingorder(input1,input2,input3);

	}

	private static void descendingorder(int input1, int input2, int input3) {
		if(input1 > input2 && input1 > input3) 
		{
			System.out.print(input1+" ");
			if(input2 > input3)
			{
				System.out.print(input2+" ");
				System.out.print(input3+" ");
			}
			else
			{
				System.out.print(input3+" ");
				System.out.print(input2+" ");
			}
		}
		else if(input2 > input1 && input2 > input3) 
		{
			System.out.print(input2+" ");
			if(input1 > input3)
			{
				System.out.print(input1+" ");
				System.out.print(input3+" ");
			}
			else
			{
				System.out.print(input3+" ");
				System.out.print(input1+" ");
			}
		}
		else if(input3 > input1 && input3 > input1) 
		{
			System.out.print(input3+" ");
			if(input1 > input2)
			{
				System.out.print(input1+" ");
				System.out.print(input2+" ");
			}
			else
			{
				System.out.print(input2+" ");
				System.out.print(input1+" ");
			}
		}
	}

}
