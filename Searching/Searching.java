package com.sorting.Searching;

import com.sorting.Employee;

public class Searching {

    // 1 > Binary search implementation for Employee array based on the name field
    public static int binarySearch(Employee[] employees, String key) {
        int low = 0;
        int high = employees.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            // Compare the key with the name of the middle employee
            int cmp = key.compareTo(employees[mid].getName());

            if (cmp == 0) {
                // If the key matches the name of the middle employee, return the index
                return mid;
            } else if (cmp < 0) {
                // If the key is less than the name of the middle employee, search in the left half
                high = mid - 1;
            } else {
                // If the key is greater than the name of the middle employee, search in the right half
                low = mid + 1;
            }
        }

        // If the key is not found, return -1
        return -1;
    }


    // 2 > Linear search implementation for Employee array based on the name field
    public static int linearSearch(Employee[] arr, String name) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

}



