import java.util.*;

public class Prime_No{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,found = 0;
		a = sc.nextInt();
		if (a <= 1){
			found = 1;
		}
		else{
			for(int i = 2;i < a ;i++){
				if(a%i == 0){
				    found = 1;	
				}
			}
		}
		if ( found == 1){
			System.out.println("Not Prime");

		}
		else {
			System.out.println("Prime");
		}
	}
}