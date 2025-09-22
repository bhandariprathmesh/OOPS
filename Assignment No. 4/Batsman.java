abstract class Player{
	public abstract void Fitness();
	public void country(){
		System.out.println("India Team Players Fitness");
	}
}
class Batsman extends Player{
	public void Fitness(){
		System.out.println("Player is Fit to Play cricket");
	}

	public static void main(String args[]){
	
	Batsman b = new Batsman();
	b.country();
	b.Fitness();
	}
}