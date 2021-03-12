package com.EmployeePayrollService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class EmployeePayrollServiceTest {

    @Test
    public void given3EmployeeWhenWrittenToFile_ShouldReturnEmployeeEntries(){
        EmployeePayrollData[] arrayOfEmployees ={
                new EmployeePayrollData(101,"Anu",25000),
                new EmployeePayrollData(102,"Lucky",50000),
                new EmployeePayrollData(103,"Rocky",20000),
        };
        EmployeePayrollService EmployeePayrollService;
        EmployeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmployees));
        employeePayrollService.writeData(EmployeePayrollService.IOService.FILE_IO);
        employeePayrollService.printData(EmployeePayrollService.IOService.FILE_IO);
        long entries = employeePayrollService.countEntries(EmployeePayrollService.IOService.FILE_IO);
        Assertions.assertEquals(3,entries);
    }
}
