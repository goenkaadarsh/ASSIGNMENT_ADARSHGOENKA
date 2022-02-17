import java.util.*;
public class ASSIGNMENT1Q9 {
	public static void main(String[] args)
	{
		int a1,b1,c1,a2,b2,c2,a3,b3,c3,d=0,d1=0,d2=0,d3=0;
		float avg=0,avg1=0,avg2=0,avg3=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the marks of student 1:");
		a1=sc.nextInt();
		b1=sc.nextInt();
		c1=sc.nextInt();
		System.out.print("Enter the marks of student 2:");
		a2=sc.nextInt();
		b2=sc.nextInt();
		c2=sc.nextInt();
		System.out.print("Enter the marks of student 3:");
		a3=sc.nextInt();
		b3=sc.nextInt();
		c3=sc.nextInt();
		d=a1+b1+c1+a2+b2+c2+a3+b3+c3;
		avg=d/3;
		d1=a1+a2+a3;
		d2=b1+b2+b3;
		d3=c1+c2+c3;
		avg1=d1/3;
		avg2=d2/3;
		avg3=d3/3;
		System.out.println(d);
		System.out.println(avg);
		System.out.println(d1);
		System.out.println(avg1);
		System.out.println(d2);
		System.out.println(avg2);
		System.out.println(d3);
		System.out.println(avg3);	
	}
}
