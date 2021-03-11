package com.EmployeePayrollService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    public enum IOService {
        CONSOLE_IO, FILE_IO, DB_IO, REST_IO;
    }

    private List<EmployeePayrollData> employeeList;
    public EmployeePayRollService() {}

    public EmployeePayrollService(List<EmployeePayrollData> employeeList) {
        this.employeeList = employeeList;
    }

    //Read data from console.
    private void readData(Scanner sc) {
        System.out.println("Enter Employee ID: ");
        int ID = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Employee Name: ");
        String Name = sc.nextLine();
        System.out.println("Enter Employee Salary: ");
        Double Salary = Double.parseDouble(sc.nextLine());
        employeeList.add(new EmployeePayrollData(ID, Name, Salary));
    }

    //writes data to console.
    public void writeData() {
        System.out.println("\nWriting Employee Payroll Roaster to Console...\n" + employeeList);
    }

    public static void main(String[] args) {
        ArrayList<EmployeePayrollData> employeeList = new ArrayList<>();
        EmployeePayrollService empService = new EmployeePayrollService(employeeList);
        Scanner sc = new Scanner(System.in);
        empService.readData(sc);
        empService.writeData();
    }
}