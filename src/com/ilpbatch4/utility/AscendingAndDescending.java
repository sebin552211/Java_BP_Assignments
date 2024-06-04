package com.ilpbatch4.utility;

public class AscendingAndDescending {

	public static void main(String[] args) {
		int input1=12, input2=42, input3=64, input4=88;
		descendingorder(input1,input2,input3,input4);
		System.out.print("\n");
		ascendingorder(input1,input2,input3,input4);
	}

	private static void ascendingorder(int input1, int input2, int input3, int input4) {
		if(input1 < input2 && input1 < input3 && input1 < input4) 
		{
			System.out.print(input1+" ");
			if(input2 < input3 && input2 < input4)
			{
				System.out.print(input2+" ");
				if(input3 < input4)
				{
					System.out.print(input3+" ");
					System.out.print(input4+" ");
				}
				else
				{
					System.out.print(input4+" ");
					System.out.print(input3+" ");
				}
				
			}
			else if(input3 < input2 && input3 < input4)
			{
				System.out.print(input3+" ");
				if(input2 < input4)
				{
					System.out.print(input2+" ");
					System.out.print(input4+" ");
				}
				else
				{
					System.out.print(input4+" ");
					System.out.print(input2+" ");
				}
				
			}
			else if(input4 < input2 && input4 < input3)
			{
				System.out.print(input4+" ");
				if(input2 < input3)
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
		}
		
		if(input2 < input1 && input2 < input3 && input2 < input4) 
		{
			System.out.print(input2+" ");
			if(input1 < input3 && input1 < input4)
			{
				System.out.print(input1+" ");
				if(input3 < input4)
				{
					System.out.print(input3+" ");
					System.out.print(input4+" ");
				}
				else
				{
					System.out.print(input4+" ");
					System.out.print(input3+" ");
				}
				
			}
			else if(input3 < input1 && input3 < input4)
			{
				System.out.print(input3+" ");
				if(input1 < input4)
				{
					System.out.print(input1+" ");
					System.out.print(input4+" ");
				}
				else
				{
					System.out.print(input4+" ");
					System.out.print(input1+" ");
				}
				
			}
			else if(input4 < input1 && input4 < input3)
			{
				System.out.print(input4+" ");
				if(input1 < input3)
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
		}
		
		if(input3 < input1 && input3 < input2 && input3 < input4) 
		{
			System.out.print(input3+" ");
			if(input1 < input2 && input1 < input4)
			{
				System.out.print(input1+" ");
				if(input2 < input4)
				{
					System.out.print(input2+" ");
					System.out.print(input4+" ");
				}
				else
				{
					System.out.print(input4+" ");
					System.out.print(input2+" ");
				}
				
			}
			else if(input3 < input1 && input3 < input4)
			{
				System.out.print(input3+" ");
				if(input1 < input4)
				{
					System.out.print(input1+" ");
					System.out.print(input4+" ");
				}
				else
				{
					System.out.print(input4+" ");
					System.out.print(input1+" ");
				}
				
			}
			else if(input4 < input1 && input4 < input2)
			{
				System.out.print(input4+" ");
				if(input1 < input2)
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
		
		if(input4 < input1 && input4 < input2 && input4 < input3) 
		{
			System.out.print(input4+" ");
			if(input1 < input2 && input1 < input3)
			{
				System.out.print(input1+" ");
				if(input2 < input3)
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
			else if(input2 < input1 && input2 < input3)
			{
				System.out.print(input2+" ");
				if(input1 < input3)
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
			else if(input3 < input1 && input3 < input2)
			{
				System.out.print(input3+" ");
				if(input1 < input2)
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
		


	private static void descendingorder(int input1, int input2, int input3, int input4) 
	{
		if(input1 > input2 && input1 > input3 && input1 > input4) 
		{
			System.out.print(input1+" ");
			if(input2 > input3 && input2 > input4)
			{
				System.out.print(input2+" ");
				if(input3 > input4)
				{
					System.out.print(input3+" ");
					System.out.print(input4+" ");
				}
				else
				{
					System.out.print(input4+" ");
					System.out.print(input3+" ");
				}
				
			}
			else if(input3 > input2 && input3 > input4)
			{
				System.out.print(input3+" ");
				if(input2 > input4)
				{
					System.out.print(input2+" ");
					System.out.print(input4+" ");
				}
				else
				{
					System.out.print(input4+" ");
					System.out.print(input2+" ");
				}
				
			}
			else if(input4 > input2 && input4 > input3)
			{
				System.out.print(input4+" ");
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
		}
		
		if(input2 > input1 && input2 > input3 && input2 > input4) 
		{
			System.out.print(input2+" ");
			if(input1 > input3 && input1 > input4)
			{
				System.out.print(input1+" ");
				if(input3 > input4)
				{
					System.out.print(input3+" ");
					System.out.print(input4+" ");
				}
				else
				{
					System.out.print(input4+" ");
					System.out.print(input3+" ");
				}
				
			}
			else if(input3 > input1 && input3 > input4)
			{
				System.out.print(input3+" ");
				if(input1 > input4)
				{
					System.out.print(input1+" ");
					System.out.print(input4+" ");
				}
				else
				{
					System.out.print(input4+" ");
					System.out.print(input1+" ");
				}
				
			}
			else if(input4 > input1 && input4 > input3)
			{
				System.out.print(input4+" ");
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
		}
		
		if(input3 > input1 && input3 > input2 && input3 > input4) 
		{
			System.out.print(input3+" ");
			if(input1 > input2 && input1 > input4)
			{
				System.out.print(input1+" ");
				if(input2 > input4)
				{
					System.out.print(input2+" ");
					System.out.print(input4+" ");
				}
				else
				{
					System.out.print(input4+" ");
					System.out.print(input2+" ");
				}
				
			}
			else if(input3 > input1 && input3 > input4)
			{
				System.out.print(input3+" ");
				if(input1 > input4)
				{
					System.out.print(input1+" ");
					System.out.print(input4+" ");
				}
				else
				{
					System.out.print(input4+" ");
					System.out.print(input1+" ");
				}
				
			}
			else if(input4 > input1 && input4 > input2)
			{
				System.out.print(input4+" ");
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
		
		if(input4 > input1 && input4 > input2 && input4 > input3) 
		{
			System.out.print(input4+" ");
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
			else if(input3 > input1 && input3 > input2)
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

}
