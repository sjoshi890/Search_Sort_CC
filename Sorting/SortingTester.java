package com.sorting.Sorting;

import com.sorting.Employee;
import com.sorting.Sorting.Sorting;

import static com.sorting.Employee.*;

public class SortingTester {
    public static void main(String[] args) {

        // fetch all the employee details
        Employee[] empArray = employeeList();


        // call bubbleSort method of Sort class
//        Sorting.bubbleSort(empArray);

        // call insertionSort method of Sort class
        Sorting.selectionSort(empArray);
        // display list of employee after sorting
        System.out.println("Sorted list of Employee based on their Salary : ");
        for (Employee e : empArray
        ) {
            System.out.println(e);
        }

    }
}