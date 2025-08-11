// using recursion

import java.util.*;

public class Factorial_Recursion
{
	public static void factorial(int n,int fact)
		{
			if(n == 0)
				{
					System.out.println("Factorial is " +fact);
					return;	
				}
			fact *= n;
			factorial(n-1,fact);
		}
	public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the No. to calculate factorial : ");
			int n1 = sc.nextInt();
			int fact1 = 1;
			factorial(n1,fact1);
		}
}