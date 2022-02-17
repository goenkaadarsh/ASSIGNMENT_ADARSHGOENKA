import java.util.*;
public class ASSIGNMENT1Q5 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		double amount=0,inc;
		System.out.println("Enter the Income Amount:");
		inc=sc.nextDouble();
		if(inc>0 && inc<=180000)
			amount=0;
		else if(inc>180000 && inc<=300000)
			amount=0.1*(inc);
		else if(inc>300001 && inc<=500000)
			amount=0.2*inc;
		else if(inc>500001 && inc<=1000000)
			amount=0.3*inc;
		System.out.println("The Tax Amount is :"+amount);
	}

}
