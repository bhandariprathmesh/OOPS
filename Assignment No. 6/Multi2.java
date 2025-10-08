// to demonstrate which thread is running presently

public class Multi2 implements Runnable
{
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println("Thread "+Thread.currentThread().getName()+" is "+i+" Running");
		}
	}
	public static void main(String args[])
	{
		Multi2 m=new Multi2();
		Thread t1=new Thread(m,"IT");
		Thread t2=new Thread(m,"CS");
		Thread t3=new Thread(m,"civil");
		t1.start();
		t2.start();
		t3.start();
	}
}