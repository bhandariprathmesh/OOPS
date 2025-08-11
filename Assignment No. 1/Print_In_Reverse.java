import java.util.*;

public class Print_In_Reverse{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No. :");
		int a = sc.nextInt();
		System.out.println("In Ascending order:");
		for(int i = 1; i <= a;i++){
			System.out.println(i);
		}
		System.out.println("In Descending order:");
		for(int i = a; i >= 1;i--){
			System.out.println(i);
		}		
	}
}