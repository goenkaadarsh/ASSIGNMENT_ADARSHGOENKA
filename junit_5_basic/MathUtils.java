package junit_5_basic;

public class MathUtils {
	
	public int add(int a, int b)
	{
		return a+b;
	}
	public int divide(int a,int b)
	{
		return a/b;
	}
	public int multiply(int a, int b) {
		return a*b;
	}
	public int[] findMinMax(int[] arr,int n) {
		int max= arr[0];
		int min= arr[0];
		for(int i=1;i<n;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			else if(arr[i]<min)
				min=arr[i];
		}
		int a[]= {min,max};
		return a;
		
	}

}
