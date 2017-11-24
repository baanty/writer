/**
 * 
 */
package product.pojo;

import java.io.Serializable;

/**
 * @author WE43MM
 *
 */
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4101780770417552972L;
	
	private String name;
	private int employeeId;
	
	
	public Employee() {
		super();
	}
	public Employee(String name, int employeeId) {
		super();
		this.name = name;
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public static int compareByName(Employee firstEmployee, Employee secondEmployee){
		return firstEmployee.getName().compareTo(secondEmployee.getName());
	}
	
	public static int copareById(Employee firstEmployee, Employee secondEmployee){
		return Integer.valueOf(firstEmployee.getEmployeeId()).compareTo(secondEmployee.getEmployeeId());
	}
	
	public static String getCode(){
		return "TYHUGH7346";
	}
	
	
}
