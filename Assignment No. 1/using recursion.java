// using recursion

import java.util.*;

public class Factorial_Recursion
{
	public static void factorial(int n)
		{
			n *= 5;
			return n;
		}
	public static void main(String[] args)
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the No. to calculate factorial : ");
			// int n1 = sc.nextInt();
			int n = 24;
			factorial(n);

			System.out.println("Ans is :" +n);
		}
}