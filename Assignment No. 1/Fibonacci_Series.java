import java.util.*;

public class Fibonacci_Series{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n,found = 0;
		System.out.print("Enter the No. of Fibonacci Series :");
		n = sc.nextInt();
                int a = 0;
		int b = 1;

		for(int i = 0;i < n;i++){
		int c = a + b;
		System.out.println(c);
		a = b;
		b = c;
		}		
	}
}