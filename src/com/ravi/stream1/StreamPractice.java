package com.ravi.stream1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamPractice {

	public static void main(String[] args) {
		List<Employee> emp = new ArrayList<Employee>();

		emp.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0,"Hyd"));
		emp.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0,"Pune"));
		emp.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0,"Mumbai"));
		emp.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0,"Noida"));
		emp.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0,"Delhi"));
		emp.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0,"Bangalore"));
		emp.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0,"Delhi"));
		emp.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0,"Hyd"));
		emp.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0,"Pune"));
		emp.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5,"Chennai"));
		emp.add(new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0,"Mumbai"));
		emp.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0,"Nagpur"));
		emp.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0,"Pune"));
		emp.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5,"Bangalore"));
		emp.add(new Employee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0,"Hyd"));
		emp.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0,"Pune"));

		/*
		 * // 1. How many male and female employees are there in the organization?
		 * Map<String, Long> map1 =
		 * emp.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.
		 * counting())); System.out.println(map1);
		 * 
		 */

		/*
		 * // 2. List down the names of all employees in each department ?
		 * 
		 * Map<String, List<String>> map1=
		 * emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors
		 * .mapping(Employee::getName,Collectors.toList()))); System.out.println(map1);
		 * 
		 */

		/*
		 * // 3. print name of all department in the organization ?
		 * 
		 * emp.stream().map(e -> e.getDepartment()).distinct().forEach(name ->
		 * System.out.println(name));
		 */

		/*
		 * //4 . what is the average age of male and female employee
		 * 
		 * Map<String, Double> map1 = emp.stream()
		 * .collect(Collectors.groupingBy(Employee::getGender,
		 * Collectors.averagingInt(Employee::getAge))); System.out.println(map1);
		 */

		/*
		 * // 5. get the highest paid employee in the organization?
		 * 
		 * Optional<Employee> optional =
		 * emp.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee ::
		 * getSalary)));
		 * 
		 * if(optional.isPresent()) {
		 * 
		 * Employee emp1 = optional.get(); System.out.println(emp1);
		 * 
		 * }
		 */

		/*
		 * // 6. get the name of all employee who have joined after 2015 ?
		 * 
		 * emp.stream().filter(e -> e.yearOfJoining >2015).map(e -> e.name).forEach(name
		 * -> System.out.println(name));
		 */

		/*
		 * //7. what is average salary of each department
		 * 
		 * Map<String, Double> map7 =
		 * emp.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors
		 * .averagingDouble(Employee:: getSalary)));
		 * 
		 * System.out.println(map7);
		 */

		/*
		 * // 8 .get the details of the youngest male employee in the development
		 * department
		 * 
		 * 
		 * Optional<Employee> optional = emp.stream().filter(e ->
		 * e.getGender().equals("Male")&& e.getDepartment().equals("Development"))
		 * .min(Comparator.comparing(Employee::getAge));
		 * 
		 * if(optional.isPresent()) { System.out.println(optional.get()); }
		 */

		/*
		 * // 9. who is the most working experience in the organization ?
		 * 
		 * Optional<Employee> optional =
		 * emp.stream().collect(Collectors.minBy(Comparator.comparing(Employee::
		 * getYearOfJoining)));
		 * 
		 * 
		 * if(optional.isPresent()) { System.out.println(optional.get()); }
		 * 
		 * 
		 */

		/*
		 * // 10. How many male and female employees are there in the sales team?
		 * 
		 * Map<String, Long> map10 = emp.stream().filter(e ->
		 * e.getDepartment().equals("Sales")).collect(Collectors.groupingBy(Employee::
		 * getGender,Collectors.counting()));
		 * 
		 * 
		 * System.out.println(map10);
		 */

		/*
		 * // 11.what is the average salary of male and female employee?
		 * 
		 * Map<String, Double> map11 = emp.stream()
		 * .collect(Collectors.groupingBy(Employee::getGender,
		 * Collectors.averagingDouble(Employee::getSalary)));
		 * 
		 * System.out.println(map11);
		 */
		
		/*
		 * // 12. Count the number of employee in each department
		 * 
		 * Map<String, Long> map12 = emp.stream().collect(Collectors.groupingBy(Employee
		 * :: getDepartment,Collectors.counting()));
		 * 
		 * System.out.println(map12);
		 * 
		 */
		
		/*
		 * // 13.what is the average salary and total salary of the whole organization
		 * 
		 * Double collect = emp.stream().collect(Collectors.averagingDouble
		 * (Employee::getSalary)); Double collect2 =
		 * emp.stream().collect(Collectors.summingDouble(Employee::getSalary));
		 * 
		 * 
		 * System.out.println("average salary " +collect + "     total salary "
		 * +collect2);
		 * 
		 * 
		 */
		
		
		/*
		 * // 14. separate the employee who are younger or equal to 25 years from those
		 * employees who are older than 25 year
		 * 
		 * emp.stream().filter(e -> e.getAge() <= 25 ).forEach(e ->
		 * System.out.println(e.getName() +"   " +e.getAge()));
		 * System.out.println("==========="); emp.stream().filter(e -> e.getAge() >
		 * 25).forEach(e -> System.out.println(e.getName() +"   " +e.getAge()));
		 * 
		 */
		
		
		// 14. who is the oldest employee in the organization
		
		Optional<Employee> optional = emp.stream().collect(Collectors.maxBy(Comparator.comparing(Employee :: getAge)));
		
		
		if(optional.isPresent()) {
			System.out.println(   optional.get() );
		}
		
		
		
		
		
	}
}
