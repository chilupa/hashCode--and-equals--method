import java.util.HashSet;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee1 = new Employee(22, "Pavan");
		Employee employee2 = new Employee(23, "Pavan");
		Employee employee3 = new Employee(22, "Pavan");
		
		HashSet<Employee> employeesHashSet = new HashSet<>();
		employeesHashSet.add(employee1);
		System.out.println(employeesHashSet.contains(employee3));
		System.out.println("employee1.hashCode():  " + employee1.hashCode()
        + "  employee2.hashCode():" + employee3.hashCode());

	}

}
