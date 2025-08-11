import java.util.*;

public class Greatest_of3_2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st No. :");
		int a = sc.nextInt();
		System.out.print("Enter 2nd No. :");
		int b = sc.nextInt();
		System.out.print("Enter 3rd No. :");
		int c = sc.nextInt();
		int val = ((a > b) ? (a > c ? a:c) : (b > c ? b:c));
		System.out.println(val);
				
	}
}