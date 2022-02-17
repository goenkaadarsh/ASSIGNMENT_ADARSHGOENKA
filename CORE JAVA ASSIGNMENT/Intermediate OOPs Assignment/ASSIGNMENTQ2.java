import java.util.ArrayList;


class Manager extends ASSIGNMENTQ2 {
    @Override
    public int getSalary(int salary) {
        int incentive = 5000;
        return salary+incentive;
    }
}

class Labour extends ASSIGNMENTQ2 {
    @Override
    public int getSalary(int salary) {
        int overtime = 500;
        return salary+overtime;
    }
}

public class ASSIGNMENTQ2 { 
    static int salary = 10000;
    static int sum = 0,i;
    public int getSalary(int salary){
		return 0;
    	
    }
    public static int totalEmployeesSalary(ArrayList<Integer> employeeSalaries){
    	for (i=0;i<=employeeSalaries.size()-1;i++) {
    		sum = sum   + employeeSalaries.get(i);
    	}
    	return sum;
    }
    public static void main(String[] args) {
    	ArrayList<Integer> employeeSalaries = new ArrayList<>();
    	Labour lb = new Labour();
    	Manager mg = new Manager();
    	employeeSalaries.add(lb.getSalary(salary));
    	employeeSalaries.add(mg.getSalary(salary));
    	System.out.println(totalEmployeesSalary(employeeSalaries));
    	
    }
}
