public class Array_Test{
	public static void main(String args[]){
		// int arr[] = new int[5];
		int arr[] = {12,45,69,97,25};
		
		try{
			System.out.println(arr[5]);
		}
		catch(Exception e){
			System.out.println("You are trying to access above the array size");
		}
	}
}