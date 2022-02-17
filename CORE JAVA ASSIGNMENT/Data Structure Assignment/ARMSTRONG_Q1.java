import java.util.Scanner;
class ARMSTRONG_Q1 {
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int n,r,s=0,num;
		System.out.println("Enter the Number:");
		n=sc.nextInt();
		num=n;
		while(n>0)
		{
			r=n%10;
			s=s+r*r*r;
			n=n/10;
		}
		if(s==num)
			System.out.println(num+ " is an Armstrong Number");
		else
			System.out.println(num+ " is not an Armstrong Number");
	}
}

}
