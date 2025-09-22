public class Null2
{
	public static void main(String  args[])
	{
		String a=null;
		try
		{	
		System.out.println(a.length());
		}
		catch(Exception e)
		{		
			System.out.println("Cannot print the length of the String because its having the null value :"+e);
		}	
	}
}