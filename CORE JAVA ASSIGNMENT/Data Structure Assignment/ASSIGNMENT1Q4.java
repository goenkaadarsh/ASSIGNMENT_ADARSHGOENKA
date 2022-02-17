import java.util.*;
public class ASSIGNMENT1Q4 {
	public static void main(String[] args)
	{
		int a1,a2,a3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Marks:");
		a1=sc.nextInt();
		a2=sc.nextInt();
		a3=sc.nextInt();
		if(a1>60 && a2>60 && a3>60)
			System.out.println("Passed");
		else if(a1+a2>60 || a2+a3>60 || a3+a1>60)
			System.out.println("Promoted");
		else if(a1>60 || a2>60 || a3>60 || a1+2+a3<60)
			System.out.println("Failed");
	}

}
