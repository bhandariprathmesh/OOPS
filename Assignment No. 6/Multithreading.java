public class Multithreading extends Thread
{
public void run(){
for(int i=0;i<5;i++)
{ 
System.out.println("Thread is running count: "+i);
}
}
public static void main(String args[])
{ 
Multithreading m1 = new Multithreading();
Multithreading m2 = new Multithreading();
m1.start();
m2.start();
}
}