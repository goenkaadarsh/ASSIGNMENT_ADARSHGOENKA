package LambdaAssignment;

import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UpperCaseEquivalent_Q6 {
	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<>();
	    list.add("My");
	    list.add("first");
	    list.add("Lambda");
	    list.add("assignment");
	    list.add("completed");
	    list.add("successfully");
	    
	    UpperCase(list,p->p.toUpperCase());
	}
	
	public static void UpperCase(List<String> list,UnaryOperator<String> unaryOperator) 
	{
		
		list.replaceAll(unaryOperator);
		for (String i: list) 
		{
			unaryOperator.apply(i);
			System.out.println(i);
		}
		
	}

}
