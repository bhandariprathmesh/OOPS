import java.util.Scanner;

public class ForLoop
{
    public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the size of array :");
int n = sc.nextInt();
int f1[] = new int[n];
for(int i = 0;i < n;i++)
{
        System.out.print("Enter "+(i+1)+" No.");
	f1[i] = sc.nextInt();
}
int sum = 0;
for(int i = 0;i < f1.length;i++){
	sum += f1[i];
}
System.out.println("Addition given no. :" +sum);
}
}