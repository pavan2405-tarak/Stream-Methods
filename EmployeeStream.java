package Pratice1;

import java.util.Arrays;
import java.util.List;

public class EmployeeStream {
	public static void main(String[] args) {
		List<Employee> emp=Arrays.asList(new Employee(101, "Ramesh", "Adminstration", 50000, 32),
				new Employee(102, "Kishore", "Development", 60000, 31),
				new Employee(103, "Ravi", "Testing", 40000, 28),
				new Employee(104, "Pavan", "Development", 50000, 30),
				new Employee(105, "Sai", "Finance", 20000, 27));
	//Fetching the details of Employees who's in Development Department
	List<Employee> Developmentemps=emp.stream().filter(s->s.getDepartment().equals("Development")).toList();
	//Fetching the Details of Employees who's Salary is Greater than 40000
	List<Employee> Salariesofemps=emp.stream().filter(s->s.getSalary()>40000).toList();
	//Fetching the Details of Employees who's Age below 30
	List<Employee> agebelow30emps=emp.stream().filter(s->s.getAge()<30).toList();
	//Fetching the details of employees who's age is above 30
	List<Employee> ageabove30emps=emp.stream().filter(s->s.getAge()>30).toList();

	System.out.println(Developmentemps);
	System.out.println(Salariesofemps);
	System.out.println(agebelow30emps);
	System.out.println(ageabove30emps);
	}

}
