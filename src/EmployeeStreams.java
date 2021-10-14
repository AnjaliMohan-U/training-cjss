
import java.util.*;
import java.util.stream.Collectors;

import com.cjss.training.employee.*;

public class EmployeeStreams {

	public static void main(String[] args) {

		Location loc1 = new Location("I-h1", "hyderabad", "India");
		Location loc2 = new Location("I-c1", "chennai", "India");
		Location loc3 = new Location("UK-l1", "London", "United Kingdom");

		List<Location> locations = Arrays.asList(loc1, loc2, loc3);

		Department d1 = new Department("d1", "health");
		Department d2 = new Department("d2", "finance");
		Department d3 = new Department("d3", "admin");
		Department d4 = new Department("d4", "fraud");

		List<Department> depts = Arrays.asList(d1, d2, d3, d4);

		Benefits b1 = new Benefits("b1", "health benefit", "All the members of employee family will get concession");
		Benefits b2 = new Benefits("b2", "finance benefit", "will get personal loans");
		Benefits b3 = new Benefits("b3", "Home benefit", "employee will get housing loan");
		Benefits b4 = new Benefits("b4", "education benefit", "employee will get education loan");

		List<Benefits> bn1 = Arrays.asList(b4, b3);
		List<Benefits> bn2 = Arrays.asList(b1, b2);
		List<Benefits> bn3 = Arrays.asList(b3, b2);
		List<Benefits> bn4 = Arrays.asList(b2, b3);

		Employee emp1 = new Employee("e1", "ram", 50000, "I-h1", "d1", bn2);
		Employee emp2 = new Employee("e2", "sitha", 65000, "UK-l1", "d4", bn1);
		Employee emp3 = new Employee("e3", "laxman", 47000, "I-c1", "d3", bn3);
		Employee emp4 = new Employee("e4", "bharath", 43000, "I-h1", "d3", null);
		Employee emp5 = new Employee("e5", "shatrugna", 100000, "UK-l1", "d2", null);
		Employee emp6 = new Employee("e6", "bhima", 4000, "I-h1", "d1", null);
		Employee emp7 = new Employee("e7", "surya", 3000, "I-hc1", "d4", null);

		List<Employee> employees = Arrays.asList(emp1, emp2, emp3, emp4, emp5, emp6, emp7);

		System.out.println(
				"----------------------------------------Retrieve all employees in India-----------------------------------"
						+ "\n");
		employees.stream().filter(emp -> emp.getLoc_id().startsWith("I")).forEach(emp -> {
			System.out
					.println("employee id: " + emp.getEmp_id() + " - " + " employee name: " + emp.getEmp_name() + "\n");
		});

		System.out.println(
				"----------------------------------------Retrieve all employees in Hyderabad or Chennai-----------------------------------"
						+ "\n");
		employees.stream().filter(emp -> emp.getLoc_id().endsWith("h1") || emp.getLoc_id().endsWith("c1"))
				.forEach(emp -> {
					System.out.println(
							"employee id: " + emp.getEmp_id() + " - " + " employee name: " + emp.getEmp_name() + "\n");
				});

		System.out.println(
				"----------------------------------------------Retrieve all employees who have benefits-----------------------------------"
						+ "\n");

		employees.stream().filter(emp -> emp.getBenefit() != null).forEach(System.out::println);

		System.out.println(
				"-------------------------------------Retrieve all employees details-----------------------------------"
						+ "\n");

		employees.forEach(emp -> {
			locations.stream().filter(x -> emp.getLoc_id() == x.getLoc_id()).forEach(loc -> {
				depts.stream().filter(y -> emp.getDept_id() == y.getDept_id()).forEach(dept -> {
					System.out.println("emp-id:  " + emp.getEmp_id() + "\n" + "emp-name: " + emp.getEmp_name() + "\n"
							+ "emp-salaray: " + emp.getEmp_sal() + "\n" + "dept_name: " + dept.getDept_name() + "\n"
							+ "location_name: " + loc.getLoc_name() + "\n" + "location_country: " + loc.getLoc_country()
							+ "\n");
				});
			}

			);
		});

		System.out.println(
				"---------------------------------------------Retrieve all employees in chennai and in india-----------------------------------"
						+ "\n");
		employees.stream().filter(emp -> emp.getLoc_id().endsWith("c1") && emp.getLoc_id().startsWith("I"))
				.forEach(emp -> {
					System.out.println(
							"employee id: " + emp.getEmp_id() + " - " + " employee name: " + emp.getEmp_name() + "\n");
				});

	}

}
