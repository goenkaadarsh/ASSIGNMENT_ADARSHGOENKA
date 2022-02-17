import java.util.*;
public class String_methods {
	public static void main(String[] args)
	{
		String s="Java String pool refers to collection of Strings which are stored in heap memory";
		String s1=s.toLowerCase();
		System.out.println("In LowerCase :"+s1);
		String s2=s.toUpperCase();
		System.out.println("In Upper Case :"+s2);
		System.out.println("Before Replacing:"+s);
		String s3=s.replace('a', '$');
		System.out.println("After Replacing:"+s3);
		String s4="collection";
		if(s.contains(s4))
			System.out.println("Found!!");
		else
			System.out.println("Not Found!!");
		String s5="java string pool refers to collection of strings which are stored in heap memory";
		if(s5.equals(s))
			System.out.println("Both are same!!");
		else
			System.out.println("Both are not same!");
		if(s5.equalsIgnoreCase(s))
			System.out.println("Both are Equal and Same!!!");
		
	}

}
