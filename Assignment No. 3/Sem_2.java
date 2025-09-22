import java.util.*;
class Student{
	public void student(String n){
		System.out.println("Name is "+n);
	}
}
class P RN extends Student{
	public void prn(String p){
		System.out.println("PRN is "+p);
	}
}
class Sem_1 extends PRN{
	public void sem1(Double s1){
		System.out.println("Sem-1 SGPA is "+s1);
	}
}
class Sem_2 extends Sem_1{
	public void sem2(Double s2){
		System.out.println("Sem-2 SGPA is "+s2);
}
	public void total(Double s3, Double s4){
			Double t = (s3 + s4) / 2;
			System.out.println("CGPA is "+t);
		}
	public static void main(String args[]){
		Sem_2 s = new Sem_2(); 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name :");
		String name = sc.next();
		System.out.print("Enter PRN :");
		String roll_no = sc.next();
		System.out.print("Enter Sem-1 SGPA :");
		double sem01 = sc.nextDouble();
		System.out.print("Enter Sem-2 SGPA :");
		double sem02 = sc.nextDouble();
		s.student(name);
		s.prn(roll_no);
		s.sem1(sem01);
		s.sem2(sem02);	
		s.total(sem01,sem02);
	}
}