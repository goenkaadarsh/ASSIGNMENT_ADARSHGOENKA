package LambdaAssignment;
import java.util.ArrayList;
class Order{
	private int totalPrice;
	private String status;
	Order(int totalPrice, String status){
		this.totalPrice=totalPrice;
		this.status=status;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Order [totalPrice=" + totalPrice + ", status=" + status + "]";
	}
}
public class OrderCriteria_Q2 {
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
	    for (Order order : od) {
	    	System.out.println(order);
			
		}
	    System.out.println("Implemented using Prices");
	    od.stream().filter(o-> o.getTotalPrice()>10000).forEach(o->System.out.println(o.getTotalPrice()));
	    System.out.println("Implemented Using Status");
	    od.stream().filter(o-> o.getStatus().startsWith("Completed/Accepted")).forEach(o->System.out.println(o.getStatus()));
	    
	    
	    
	}
	
	
	
	
	
	
	

	

}
