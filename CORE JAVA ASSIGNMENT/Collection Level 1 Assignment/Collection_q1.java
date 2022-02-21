import java.util.TreeMap;
import java.util.*;
public class Collection_q1 {
	public static void main(String[] args)
	{
		TreeMap<Long,String> contact=new TreeMap<>();
		contact.put((long) 916387843, "Adarsh");
		contact.put((long) 943388789, "Bimal");
		contact.put((long) 987456983, "Manoj");
		contact.put((long) 969874152, "Mandeep");
		System.out.println(contact.keySet());
		System.out.println(contact.values());
		System.out.println(contact);
	}
}
