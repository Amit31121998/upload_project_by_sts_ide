package com.hsckerRank;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class StreamQuestion {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<Employee>();

		empList.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
		empList.add(new Employee(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
		empList.add(new Employee(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
		empList.add(new Employee(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
		empList.add(new Employee(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
		empList.add(new Employee(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
		empList.add(new Employee(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
		empList.add(new Employee(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
		empList.add(new Employee(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
		empList.add(new Employee(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
		empList.add(new Employee(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
		empList.add(new Employee(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
		empList.add(new Employee(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
		empList.add(new Employee(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
		empList.add(new Employee(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
		empList.add(new Employee(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));

		// 1. How many male and female employees are there in the organization ?
		// Map<String, Long> map =
		// empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		// System.out.println(map);

		// 2. Print the name of all departments in the organization ?
		// empList.stream().map(Employee::getDepartment).distinct().forEach(d->System.out.println(d));

		// 3. What is the average age of male and female employees ?

		// Map<String, Double> map =
		// empList.stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingDouble(Employee::getAge)));
		// System.out.println(map);

		/*
		 * 4. Get the details of highest paid employee in the organization ?
		 * 
		 * Optional<Employee> optional =
		 * empList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee
		 * ::getSalary))); if(optional.isPresent()) {
		 * System.out.println(optional.get()); }
		 */
		// Employee employee =
		// empList.stream().max(Comparator.comparing(Employee::getSalary)).get();
		// System.out.println(employee);

		// Employee employee =
		// empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).findFirst().get();
		// System.out.println(employee);

		// Get the details of lowest paid employee in the organization?

		// Employee employee =
		// empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).findFirst().get();
		// System.out.println(employee);

		// Count the number of employees in each department?
		// Map<String, Long> map =
		// empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		// System.out.println(map);

		// Get the names of all employees who have joined after 2015?
		// empList.stream().filter(e -> e.yearOfJoining >
		// 2015).map(Employee::getName).forEach(e -> System.out.println(e));

		// What is the average salary of each department?
		// Map<String, Double> collect =
		// empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
		// System.out.println(collect);

		// Get the details of youngest male employee in the product Development
		// department?

		// Employee employee =
		// empList.stream().filter(e->e.getDepartment().equals("Development")).min(Comparator.comparingInt(Employee::getAge)).get();
		// System.out.println(employee);

		// Employee employee =
		// empList.stream().filter(e->e.getDepartment().equals("HR")).min(Comparator.comparing(Employee::getAge)).get();
		// System.out.println(employee);

		// Who has the most working experience in the organization?

		// Employee employee =
		// empList.stream().sorted(Comparator.comparing(Employee::getYearOfJoining)).findFirst().get();
		// System.out.println(employee);

		// How many male and female employees are there in the sales and marketing team?

		// Map<String, Long> collect = empList.stream().filter(e ->
		// e.getDepartment().equals("Development"))
		// .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		// System.out.println(collect);

		// What is the average salary of male and female employees?

		/*
		 * Map<String, Double> collect = empList.stream()
		 * .collect(Collectors.groupingBy(Employee::getGender,
		 * Collectors.averagingDouble(Employee::getSalary)));
		 * System.out.println(collect);
		 */

		/*
		 * // List down the names of all employees in each department?
		 * 
		 * Set<Entry<String, List<Employee>>> entrySet =
		 * empList.stream().collect(Collectors.groupingBy(Employee::getDepartment)).
		 * entrySet(); for(Entry<String,List<Employee>> entry:entrySet) {
		 * System.out.println("Department Name: "+entry.getKey()); List<Employee>
		 * emp=entry.getValue(); for(Employee e:emp) {
		 * System.out.println("Employee Name "+e.getName()); }
		 * System.out.println("==================="); }
		 */

		/*
		 * //Who is the oldest employee in the organization? What is his age and which
		 * department he belongs to?
		 * 
		 * Employee e =
		 * empList.stream().max(Comparator.comparingInt(Employee::getAge)).get();
		 * System.out.println(e.getName()); System.out.println(e.getAge());
		 * System.out.println(e.getDepartment());
		 */

		/*
		 * // need to find 1st three employee details based on highest salary?
		 * 
		 * empList.stream() .sorted(Comparator.comparingDouble(Employee::getSalary)
		 * .reversed()) .limit(3) .forEach(e->System.out.println(e));
		 */

		/*
		 * //second hightest salary in organization
		 * 
		 * Employee emp = empList.stream()
		 * .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
		 * .skip(1).findFirst().get(); System.out.println(emp.getSalary());
		 */

		/*// Highest sal in each Dept
		Map<String, Optional<Employee>> map = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,
				Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
		
		Set<Entry<String, Optional<Employee>>> entrySet = map.entrySet();
		
		for(Entry<String, Optional<Employee>> entry:entrySet) {
			System.out.println(entry.getKey());
			Optional<Employee> optional = entry.getValue();
			if(optional.isPresent()) {
				Employee emp = optional.get();
				System.out.println(emp.getSalary());
			}
			*/
		
		/*
		 * for(Entry<String, Optional<Employee>> entry:entrySet) {
		 * System.out.println(entry.getKey()+"==="+entry.getValue().get().getSalary());
		 * } }
		 */
		
		Map<Object, Optional<Employee>> map1 = empList.stream().collect(Collectors.groupingBy(e->e.getDepartment(),Collectors.reducing(BinaryOperator.maxBy(Comparator.comparingDouble(Employee::getSalary)))));
		System.out.println(map1);
	}
}

class Employee {
	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearOfJoining;
	double salary;

	public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}
}
