public class Multi1 extends Thread
{
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println("Thread "+i+" is Running");
		}
	}
	public static void main(String args[])
	{
		Multi1 m1=new Multi1();
		Multi1 m2=new Multi1();
		Multi1 m3=new Multi1();
		m1.start();
		m2.start();
		m3.start();
	}
}