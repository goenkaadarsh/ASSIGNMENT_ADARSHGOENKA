package LambdaAssignment;
// To perform all operations using Lambda Expressions

// Creating an Interface for Addition
interface Operation{
	double operate(int a, int b);
}
public class Operations_Q1 {
	public static double addition(int a, int b) 
	{
		return a+b;
	}
	public static double subtraction(int a, int b)
	{
		return a-b;
	}
	public static double multiply(int a, int b) 
	{
		return a*b;
	}
	public static double division(int a, int b) 
	{
		return a/b;
	}
	public static void main(String[] args)
	{
		Operation addition=(a,b)-> addition(a,b);
		System.out.println("Addition :"+addition.operate(13, 5));
		Operation subtraction=(a,b)-> subtraction(a,b);
		System.out.println("Subtration :"+subtraction.operate(13, 5));
		Operation multiply=(a,b)-> multiply(a,b);
		System.out.println("Multiplication :"+multiply.operate(13, 5));
		Operation division=(a,b)-> division(a,b);
		System.out.println("Division :"+division.operate(13, 5));
	}
}
	
	
	


