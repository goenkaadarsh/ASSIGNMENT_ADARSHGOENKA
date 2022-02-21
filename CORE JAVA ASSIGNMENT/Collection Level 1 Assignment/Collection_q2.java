import java.util.HashSet;

public class Collection_q2 {
	public static void main(String[] args)
	{
		HashSet<String> hs=new HashSet<>();
		hs.add("Nike");
		hs.add("Puma");
		hs.add("Adidas");
		hs.add("Reebok");
		hs.add("UnderArmour");
		
		System.out.println("Original");
		System.out.println(hs);
		System.out.println(hs.size());
		
		hs.add("Puma");
		hs.add("Reebok");
		
		System.out.println("After adding duplicate elements");
		System.out.println(hs);
		System.out.println(hs.size());
	}

}
