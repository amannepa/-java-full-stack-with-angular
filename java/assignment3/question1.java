package generic;

import java.util.HashSet;
import java.util.Set;


public class question1 {

	public static void main(String[] args) {
		
		Set<Employee> employees = new HashSet<>();
        employees.add(new Employee(1, "Amrutha", 67000,"IT"));
        employees.add(new Employee(2, "chenna",89000,"IT"));
        employees.add(new Employee(3, "Kesava",700000,"IT"));
        employees.add(new Employee(4, "keerthi",20200,"IT"));
        employees.add(new Employee(4, "madhu",405678,"IT"));
        
        System.out.println(employees);
    	

	}
}
