import java.util.*;

public class M_Overloading2{
	public static int add(int n1,int n2){
		return n1+n2;
	}
	public static double add(double n1,double n2){
		return n1+n2;
	}
	
	public static void main(String args[]){

		int ans1 = add(10,20);
		System.out.println(ans1);
		double ans2 = add(10.1,20.2);
		System.out.println(ans2);
	}
		
}