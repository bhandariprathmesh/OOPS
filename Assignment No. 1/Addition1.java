import java.util.Scanner;
public class Addition1
{
public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);
int a,b,c;
System.out.print("Enter first no. :");
a = sc.nextInt();
System.out.print("Enter second no. :");
b = sc.nextInt();

c = a + b;
System.out.println("Addition is :"+c);

}

}