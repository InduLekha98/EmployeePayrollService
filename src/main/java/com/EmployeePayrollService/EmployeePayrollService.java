package com.EmployeePayrollService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
    public enum IOService {
        CONSOLE_IO, FILE_IO, DB_IO, REST_IO;
    }

    private List<EmployeePayrollData> employeeList;
    public EmployeePayrollService() {}

    public EmployeePayrollService(List<EmployeePayrollData> employeeList) {
        this.employeeList = employeeList;
    }
    private void readData(Scanner sc) {
        System.out.println("Enter Employee ID: ");
        int ID = Integer.parseInt(sc.nextLine());
        System.out.println("Enter Employee Name: ");
        String Name = sc.nextLine();
        System.out.println("Enter Employee Salary: ");
        double Salary = Double.parseDouble(sc.nextLine());
        employeeList.add(new EmployeePayrollData(ID, Name, Salary));
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
    //Count entries
    public long countEntries(IOService ioService){
        if(ioService.equals(IOService.FILE_IO))
            new EmployeePayrollFileIOService().countEntries();
        return  0;
    }

    public static void main(String[] args) {
        ArrayList<EmployeePayrollData> employeeList = new ArrayList<>();
        EmployeePayrollService empService = new EmployeePayrollService(employeeList);
        Scanner sc = new Scanner(System.in);
        empService.readData(sc);
        empService.writeData(IOService.FILE_IO);
    }
}