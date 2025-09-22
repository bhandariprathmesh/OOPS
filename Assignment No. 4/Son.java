interface Father{
	public void bringwater();
}
interface Mother{
	public void bringwater();
}
public class Son implements Father,Mother{
	public void bringwater(){
		System.out.println("Brought water for both Father & Mother");
	}

	public static void main(String args[]){
		Son s = new Son();
		s.bringwater();
	}
}