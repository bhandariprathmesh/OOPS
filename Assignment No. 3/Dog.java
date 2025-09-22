class Animal{
	public void voice(){
		System.out.println("In voice() of Animal");
	}
}
public class Dog extends Animal{
	public void bark(){
		System.out.println("In bark() of Dog");
	}
	public static void main(String args[]){
		Dog d = new Dog(); // Dog class object
		//Animal a = new Animal(); // Animal class object
		//Dog da = new Animal(); Not Possible
		//Animal ad = new Dog();
		
		d.voice();
		d.bark();
	}
}