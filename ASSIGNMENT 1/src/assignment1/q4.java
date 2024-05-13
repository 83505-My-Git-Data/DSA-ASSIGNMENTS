package assignment1;

import java.util.Scanner;

class Employee {
	int empid;
	String name;
	float salary;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	} 

	public Employee(int empid, String name, float salary) {
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}

}

public class q4 {

	public static void searchById(Employee emp[], int id) {
		for (int i = 0; i < emp.length; i++) {
			if (emp[i].getEmpid() == id) {
				System.out.println("Employee Found By Id: " + emp[i].toString());
			}
		}

	}

	public static void searchByName(Employee emp[], String name) {
		for (int i = 0; i < emp.length; i++) {
			if (emp[i].getName().equals(name)) {
				System.out.println("Employee Found By Id: " + emp[i].toString());
			} 
		}

	}

	public static void searchBySalary(Employee emp[], float salary) {
		for (int i = 0; i < emp.length; i++) {
			if (emp[i].getSalary() == salary) {
				System.out.println("Employee Found By Id: " + emp[i].toString());
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Employee emp[] = new Employee[3];

		emp[0] = new Employee(1, "Ronak", 20000);
		emp[1] = new Employee(2, "Harish", 30000);
		emp[2] = new Employee(3, "Ayush", 40000);

		System.out.print("Enter the Id of Employee: ");
		int id = sc.nextInt();

		searchById(emp, id);

		System.out.print("Enter the Name of Employee: ");
		String name = sc.next();

		searchByName(emp, name);

		System.out.print("Enter the Salary of Employee: ");
		float sal = sc.nextFloat();

		searchBySalary(emp, sal);

	}

}
