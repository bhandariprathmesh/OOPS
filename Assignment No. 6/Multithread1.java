public class Multithread1 implements Runnable
{
	public void run()
	{
		System.out.println("Thread Is Running");
	}
	public static void main(String args[])
	{
		Multithread1 m=new Multithread1();
		Thread t= new Thread(m);
		t.start();
	}
}