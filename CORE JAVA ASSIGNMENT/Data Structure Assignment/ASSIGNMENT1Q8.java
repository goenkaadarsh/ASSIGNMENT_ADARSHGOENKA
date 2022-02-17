import java.util.*;
public class ASSIGNMENT1Q8 {
	public static void main(String[] args)
	{
		int n,i,j,t=0;
		int arr[]={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		n=arr.length;
		for(i=0;i<n;i++) {
			for(j=0;j<(n-1);j++)
			{
				if(arr[j]>arr[j+1])
				{
					t=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=t;
				}
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
