package com.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Create an Employee Class
public class Employee {
    private int EmpId;
    private String Name;
    private int Salary;

    public Employee(int empId, String name, int salary) {
        this.EmpId = empId;
        this.Name = name;
        this.Salary = salary;
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    // employeeList method to get all employee details as input
    public static Employee[] employeeList() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total numbers of employees to sort : ");
        int empSize = sc.nextInt();

        // input as total numbers of employee
        Employee[] employees = new Employee[empSize];

        // input as each employee one by one
        for (int i = 0; i < empSize; i++) {
            System.out.println("Enter details of Employee " + (i + 1) + " in the order of ID, Name and Salary : ");
            employees[i] = new Employee(sc.nextInt(), sc.next(), sc.nextInt());
        }

        return employees;
    }

    // dummy method for searching
    public static Employee[] employeeList2() {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee(101,"Sushil", 50000);
        employees[1] = new Employee(102,"Kamlesh", 60000);
        employees[2] = new Employee(103,"Shubham", 55000);
        employees[3] = new Employee(104,"Abhinav", 45000);
        employees[4] = new Employee(105,"Dinesh", 75000);
        return employees;
    }


    // toString method to display details of each employee
    @Override
    public String toString() {
        return
                ("EmpId=" + EmpId +
                        ", Name='" + Name + '\'' +
                        ", Salary=" + Salary);
    }
}
