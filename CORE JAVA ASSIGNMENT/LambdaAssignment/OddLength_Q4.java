package LambdaAssignment;
import java.util.ArrayList;

public class OddLength_Q4 {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Shyam");
		al.add("Ram");
		al.add("Mohan");
		al.add("Gandhi");
		al.add("Gita");
		al.add("Sita");
		al.add("Krishna");
		al.removeIf(e-> e.length()%2!=0);
		System.out.println(al);
	
	}

}



