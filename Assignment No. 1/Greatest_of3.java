import java.util.*;

public class Greatest_of3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st No. :");
		int a = sc.nextInt();
		System.out.print("Enter 2nd No. :");
		int b = sc.nextInt();
		System.out.print("Enter 3rd No. :");
		int c = sc.nextInt();
		if (a > b && a > c){
			System.out.println(a+" is Greatest");
		}
		else if (b > a && b > c){
			System.out.println(b+" is Greatest");
		}
		else{
			System.out.println(c+" is Greatest");
		}
				
	}
}