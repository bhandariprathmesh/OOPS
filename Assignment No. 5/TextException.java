// Assignment No. 5: Exception Handling
import java.util.*;
public class TextException{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a / b;
		System.out.println("Division is "+c);
		
		int d = a * b;
		System.out.println("Multiplication is "+d);

		int e = a - b;
		System.out.println("Substraction is "+e);

		int f = a + b;
		System.out.println("Addition  is "+f);
		
	}
}
