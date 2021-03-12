package com.EmployeePayrollService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    public static Scanner sc = new Scanner(System.in);
    public enum IOService {
        CONSOLE_IO, FILE_IO, DB_IO, REST_IO;
    }

    private List<EmployeePayrollData> employeeList;
    public EmployeePayrollService() {}

    public EmployeePayrollService(List<EmployeePayrollData> employeeList) {
        this.employeeList = employeeList;
    }
    public long readData(IOService ioService) {
        if (ioService.equals(IOService.CONSOLE_IO)) {
            System.out.println("Enter Employee ID: ");
            int id = sc.nextInt();
            System.out.println("Enter Employee Name: ");
            String name = sc.next();
            System.out.println("Enter Employee Salary: ");
            double salary = sc.nextDouble();
            employeeList.add(new EmployeePayrollData(id, name, salary));
        }else if(ioService.equals(IOService.FILE_IO))
            new EmployeePayrollFileIOService().readDate();
        return 3;
    }
    public void writeData(IOService ioService) {
        if(ioService.equals(IOService.CONSOLE_IO))
            System.out.println("\nOUTPUT:\n" + employeeList);
        else if(ioService.equals(IOService.FILE_IO))
            new EmployeePayrollFileIOService().writeData(employeeList);
    }
    public void printData(IOService ioService){
        if(ioService.equals(IOService.FILE_IO))
            new EmployeePayrollFileIOService().printData();
    }
    public long countEntries(IOService ioService){
        if(ioService.equals(IOService.FILE_IO))
            new EmployeePayrollFileIOService().countEntries();
        return  3;
    }

    public static void main(String[] args) {
        ArrayList<EmployeePayrollData> employeeList = new ArrayList<>();
        EmployeePayrollService empService = new EmployeePayrollService(employeeList);
        Scanner sc = new Scanner(System.in);
        empService.writeData(IOService.FILE_IO);
        empService.readData(IOService.FILE_IO);
    }
}