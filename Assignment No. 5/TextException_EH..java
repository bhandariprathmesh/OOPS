// Exception Handled
import java.util.*;
public class TextException_EH{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a = 10; //sc.nextInt();
		int b = 0;  //sc.nextInt();
		try{
			int c = a / b;
			System.out.println("Division is "+c);
		}
		catch(Exception e){
			System.out.println("Cannot Divide with zero");
		}
		
		int d = a * b;
		System.out.println("Multiplication is "+d);

		int e = a - b;
		System.out.println("Substraction is "+e);

		int f = a + b;
		System.out.println("Addition  is "+f);
		
	}
}