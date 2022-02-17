import java.util.*;
public class ARMSTRONG_Q2
{
	public static void main(String[] args)
	{
		int n,r,sum=0;
		System.out.println("Armstrong number between 100 and 999 are:");
		for(int i= 100;i<=999;i++)
		{
			n=i;
			while(n>0)
			{
				r=n%10;
				sum=sum+(r*r*r);
				n=n/10;
			}
			if(sum==i)
			{
				System.out.println(i+" ");
			}
			sum=0;
		}
	}
}