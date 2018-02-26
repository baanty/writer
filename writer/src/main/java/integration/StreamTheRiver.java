package integration;

import java.util.ArrayList;
import java.util.List;

public class StreamTheRiver {

    static List<Employee> emps = new ArrayList<Employee>();
    
    public static void makeEmployees(){
        for(int i = 1; i<=1000 ; i++){
            Employee emp = new Employee(i, "David"+i);
            emps.add(emp);
        }
    }
    
    public static void main(String[] x){
        makeEmployees();
        //emps.stream().forEach(e -> {System.out.println("Employee Name is - "+e.name+". Employee Id is - "+e.id);});
    }
    
}


final class Employee{
    int id;
    String name;

    /**
     * @param name
     */
    Employee(String name) {
        super();
        this.name = name;
    }

    /**
     * @param id
     * @param name
     */
    Employee(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    
    
} 