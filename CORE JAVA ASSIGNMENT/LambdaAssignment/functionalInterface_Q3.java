package LambdaAssignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class functionalInterface_Q3 {
	public static void main(String[] args) {
		ArrayList <Order> od=new ArrayList<>();
		
		od.add(new Order(15000, "Completed/Accepted"));
	    od.add(new Order(8000, "Completed/Accepted"));
	    od.add(new Order(9000, "Completed/Accepted"));
	    od.add(new Order(4000, "Uncompleted"));
	    od.add(new Order(17000, "Uncompleted"));
	    od.add(new Order(25000, "Completed/Accepted"));
	    od.add(new Order(3000, "Completed/Accepted"));
	    od.add(new Order(14000, "Completed/Accepted"));
	    od.add(new Order(10500, "Uncompleted"));
	    printAll(od,condition->condition.getStatus().startsWith("A") && condition.getTotalPrice()>10000,()->od.get(3),x->x.getTotalPrice(),p->System.out.println(p));
	}

	private static void printAll(ArrayList<Order> od, Predicate<Order> predicate,Supplier<Order> supplier,Function<Order, Integer> function,Consumer<Order> consumer) {
		// TODO Auto-generated method stub
		Map<Integer,String> list2 = new HashMap<>();
		for (Order order : od) {
			list2.put(function.apply(order), order.getStatus());
			if(predicate.test(order)) {
				consumer.accept(order);
			}
			
		}
		System.out.println(supplier.get());
		System.out.println(list2);
		
		
	}

	

}
