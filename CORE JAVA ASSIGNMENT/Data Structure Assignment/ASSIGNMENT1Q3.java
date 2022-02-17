import java.util.*;
public class ASSIGNMENT1Q3 {
	public static void main(String[] args)
	{
		double p,r;
		int t;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Principal:");
		p=sc.nextDouble();
		System.out.println("Enter the Rate of Interest:");
		r=sc.nextDouble();
		System.out.println("Enter the time:");
		t=sc.nextInt();
		double si,ci;
		si=(p*r*t)/100;
		ci=p*(Math.pow((1+r/100),t))-p;
		System.out.println("Simple Interest is:"+si);
		System.out.println("Coumpound Interest is:"+ci);
	}
}
