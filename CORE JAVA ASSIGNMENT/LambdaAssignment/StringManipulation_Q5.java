package LambdaAssignment;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class StringManipulation_Q5 {
	static List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
	public static void main(String[] args) {
		processWords(list);
		
	}
	public static void processWords(List<String> list2 ) {
		Consumer<List<String>> consumer = test->{
			list.stream().forEach(o-> System.out.println(o.charAt(0)));
		};
		consumer.accept(list);
		
			
		
		
		
	}

}
