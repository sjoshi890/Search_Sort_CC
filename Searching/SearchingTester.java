package com.sorting.Searching;

import com.sorting.Employee;
import static com.sorting.Employee.*;

public class SearchingTester {
    public static void main(String[] args) {
        // Access the list of employees by calling employeeList2 method
        Employee[] employees = employeeList2();

        // search for a key
        System.out.println(Searching.binarySearch(employees,"Sushil"));
    }

}
