/**
 * 
 */
package product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import product.pojo.Employee;

/**
 * @author WE43MM
 *
 * Learn Lamda
 */
public class Reader {
	
	
	public static void main(String[] args){
		
		System.out.println("Test Print");
		
		Reader instance = new Reader();
		
		/* Simple */
		/* Read Interface */
		AppService appService = new AppService() {};
		System.out.println(appService.getCode());
		System.out.println(appService.getBlock());
		
		
		/* The functional interface */
		Functialities func = () -> System.out.println("Write From Lambda ");
		//System.out.println("Test");
		func.writeSomething();
		
		
		/* The Collections iteration */
		List<Employee>  empls = instance.getDefaultEmployeesList();
		//empls.forEach(empl -> {System.out.println(empl.getName());System.out.println(empl.getEmployeeId());});
		
		/* Array Sorting*/
		//Employee comparer = Employee::new;
		Employee[] emplsArr = instance.getDefaultEmployeesArray();
		Arrays.sort(emplsArr, Employee::compareByName);	
		List<Employee> emplLst = instance.getDefaultEmployeesList();
		emplLst.forEach(e -> System.out.println(e.getEmployeeId()+" "+e.getName()));
		
		
	}
	
	public void execute(){
		System.out.println("Printed from execute");
		
	}
	
	public List<Employee> getDefaultEmployeesList(){
		return Arrays.asList(this.getDefaultEmployeesArray());
	}
	
	public Employee[] getDefaultEmployeesArray(){
		Employee ram = new Employee("Ram", 54321);
		Employee david = new Employee("David", 12345);
		Employee rahim = new Employee("Rahim", 526328);
		Employee[] empls = {ram,rahim,david};
		return empls;
		
	}

	

}

