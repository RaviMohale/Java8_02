package com.ravi.stream2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
	
	public static void main(String[] args) {
		
		Department account  = new Department("Account", 75);
		Department hr  = new Department("HR", 50);
		Department ops  = new Department("OP", 25);
		Department tech  = new Department("Tech", 150);
		
		List<Employee> emp = new ArrayList<Employee>();
		
		emp.add(new Employee("David", 25, "NY", tech));
		emp.add(new Employee("Brayan", 25, "Galle", hr));
		emp.add(new Employee("JoAnne", 45, "Negombo", ops));
		emp.add(new Employee("Jake", 65, "Galle", hr));
		emp.add(new Employee("Gerry", 25, "Matara", hr));
		emp.add(new Employee("Brent", 55, "Negomba", tech));
		emp.add(new Employee("Allice", 30, "Matara", tech));
		emp.add(new Employee("Austin", 29, "Negomba", ops));
		emp.add(new Employee("Scote", 20, "Galle", account));
		emp.add(new Employee("Branden", 32, "NY", ops));
		emp.add(new Employee("Iflias", 31, "LOndon", tech));
		emp.add(new Employee("John", 28, "Matara", account));
		
		
		/*
		 * //1. find all employees who lives in 'Matara' city, sort them by their names
		 * of employees
		 * 
		 * emp.stream().filter(e -> e.getCity().equals("Matara"))
		 * .sorted(Comparator.comparing(Employee :: getName)) .forEach(e ->
		 * System.out.println(e.getName()));
		 */
		
		/*
		 * // 2. find distinct department names that employees work for.
		 * 
		 * 
		 * emp.stream().distinct().forEach(e ->
		 * System.out.println(e.getDepartment().getDepartmentName()));
		 * System.out.println("====================");
		 * 
		 * emp.stream().map(e->
		 * e.getDepartment().getDepartmentName()).distinct().forEach(System.out::println
		 * );
		 */
		
		/*
		 * // 3. find the department names that these employees work for,where the
		 * number of employees in the department // is over 50
		 * 
		 * emp.stream().map( Employee :: getDepartment).filter( d ->
		 * d.getNoOfEmployees() > 50) .distinct().forEach(d->
		 * System.out.println(d.getDepartmentName()));
		 * 
		 * 
		 */
		
		
		
		
		/*
		 * // 4 . create a comma separate string of department names sorted
		 * alphabetically
		 * 
		 * String s = emp.stream().map(e -> e.getDepartment().getDepartmentName())
		 * .distinct().sorted().reduce(" ",(a,b) -> (a + "," + b));
		 * 
		 * System.out.println(s );
		 */
		
		
		
		/*
		 * // 5 . are there any employees from HR Department
		 * 
		 * if(emp.stream().anyMatch(e ->
		 * e.getDepartment().getDepartmentName().equalsIgnoreCase("HR"))) {
		 * System.out.println("Found the employees from HR department..."); }else {
		 * System.out.println("Not found"); }
		 */
		
		
		/*
		 * // 6. print all employee's name who are working for account department
		 * 
		 * emp.stream().filter( e ->
		 * e.getDepartment().getDepartmentName().equalsIgnoreCase("Account"))
		 * .map(Employee :: getName).forEach(System.out ::println);
		 */
		
		
		/*// 7. what is the highest number of employees in all department
		
		emp.stream().map(e -> e.getDepartment().getNoOfEmployees()).reduce(Integer :: max )
			.ifPresent(System.out ::println);	
		
		long count = emp.stream().count();
		System.out.println(count);
		*/
		
		
		/*
		 * // 8. find the department which has the highest number of employees
		 * 
		 * //emp.stream().map(Employee :: getDepartment).reduce(d1, d2)-> d1.
		 * 
		 * emp.stream().map(Employee ::
		 * getDepartment).max(Comparator.comparing(Department :: getNoOfEmployees))
		 * .ifPresent(d -> System.out.println(d.getDepartmentName()));
		 */
		// 9. find the total number of employees in all the department
		
		emp.stream().map(e -> e.getDepartment().getNoOfEmployees()).distinct().reduce(Integer::sum)
			.ifPresent(System.out ::println);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
