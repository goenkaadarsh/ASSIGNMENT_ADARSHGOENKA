package LambdaAssignment;

import java.util.Map;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.Map.Entry;

public class AppendKeyValue_Q7 {class Details implements Comparable<Details>{
	private String name;
	private String email;
	private String gender;
	
	public Details(String name, String email, String gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getGender() {
		return gender;
	}
	@Override
	public String toString() {
		return "Name:"+name+" Email:"+email+" Gender:"+gender;
	}
	@Override
	public int compareTo(Details o) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(o.getName());
	}
	
}

class phoneNumber implements Comparable<phoneNumber>{
	private long number;

	public phoneNumber(long number) {
		super();
		this.number = number;
	}
	
	public long getNumber() {
		return number;
	}

	public String toString() {
		return String.valueOf(number);
		
	}
	

	@Override
	public int compareTo(phoneNumber o) {
		// TODO Auto-generated method stub
		return this.toString().compareTo(o.toString());
	}
	
	
}

public class Assignment4Q7 {

	public static void main(String[] args) {
		Details D1 = new Details("Adarsh", "goenkaadarsh@gmail.com", "Male");
		Details D2 = new Details("Aditya", "adi7@gmail.com", "Male");
		Details D3 = new Details("Atharva", "athrva_10@gmail.com", "Male");
		Details D4 = new Details("SaiKiran", "saikiran123@gmail.com", "Male");
		Details D5 = new Details("Bhuvan", "bt@yahoo.com", "Male");
		
		phoneNumber P1 = new phoneNumber(9163878439l);
		phoneNumber P2 = new phoneNumber(9988774455l);
		phoneNumber P3 = new phoneNumber(9876543210l);
		phoneNumber P4 = new phoneNumber(9786453120l);
		phoneNumber P5 = new phoneNumber(9638520147l);
		
		Map<phoneNumber, Details> map = new TreeMap<>();
		
		map.put((new phoneNumber(9163878439l)),(new Details("Adarsh", "goenkaadarsh@gmail.com", "Male")));
		map.put((new phoneNumber(9163878439l)),(new Details("Adarsh", "goenkaadarsh@gmail.com", "Male")));
		map.put((new phoneNumber(9163878439l)),(new Details("Adarsh", "goenkaadarsh@gmail.com", "Male")));
		map.put((new phoneNumber(9163878439l)),(new Details("Adarsh", "goenkaadarsh@gmail.com", "Male")));
		map.put((new phoneNumber(9163878439l)),(new Details("Adarsh", "goenkaadarsh@gmail.com", "Male")));
		
		newStringBuilder(map,p->System.out.println(p));
		}

	}

	private static void newStringBuilder(Map<phoneNumber, Details> map,Consumer<StringBuilder> consumer) {
		StringBuilder stringBuilder =new StringBuilder();
		for(Entry<phoneNumber, Details> entry:map.entrySet()) {
			stringBuilder.append(entry.getKey());
			stringBuilder.append(entry.getValue());
		}
		consumer.accept(stringBuilder);
		
		
	}

}

	


