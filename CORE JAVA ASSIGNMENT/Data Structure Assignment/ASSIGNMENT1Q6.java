import java.util.*;
class Login{
    static String userId = "Ajay";
	static String password = "password";
	static int i = 3;
    public static String loginUser(String user, String pass) { 
    	i--;
    	String z="";
        		if((user.equals(userId) && pass.equals(password))) {
        			return "Welcome "+userId;
        			
        		}
        		else if(i>=1) {
        			System.out.println("You have entered wrong credentials ,please enter the right credentials");
        			ASSIGNMENT1Q6.main(null);
        			
        		}
        		else {
        			return "have entered wrong credentials 3 times \nContact Admin"; 
        		}
    		return z;
    	
    	
    }

}
public class ASSIGNMENT1Q6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("userId: ");
		String user=sc.next();
		System.out.println("password: ");
		String pass=sc.next();
		System.out.print(Login.loginUser(user,pass));

	}

}