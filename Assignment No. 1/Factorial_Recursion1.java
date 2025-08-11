// using recursion

import java.util.*;

public class Factorial_Recursion1
{
	public static void factorial(int n)
		{
			int total = 1;
			if(n >= 1)
				{
					total = n * factorial(n-1);
				}
			return total;
		}
	public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the No. to calculate factorial : ");
			int n1 = sc.nextInt();
			factorial(n1);
		}
}
