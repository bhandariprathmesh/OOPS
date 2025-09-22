interface Father{
	public void bringwater();
}
interface Mother{
	public void bringwater();
}
class Son implements Father,Mother{
	public void bringwater(){
		System.out.println("Brought water for both Father & Mother");
	}
}
class Grandson extends Son{
	public void name(){
		System.out.println("Name is Lav");
	}
}
class GrandDaughter extends Son{
	public void name(){
		System.out.println("Name is Kush");
	}
}
public class main1{
	public static void main(String args[]){
		Grandson gs = new Grandson();
		gs.bringwater();
		gs.name();

		GrandDaughter gd = new GrandDaughter();
		gd.bringwater();
		gd.name();
	}
}