package EmployeePayrollService;

import com.EmployeePayrollService.EmployeePayrollData;
import com.EmployeePayrollService.EmployeePayrollService;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class EmployeePayrollServiceTest {

    @Test

    public void given3EmployeeWhenWrittenToFile_ShouldReturnEmployeeEntries() {
        EmployeePayrollData[] arrayOfEmployees = {
                new EmployeePayrollData(101,"Anu",25000),
                new EmployeePayrollData(102,"Lucky",50000),
                new EmployeePayrollData(103,"Rocky",20000),
        };
        EmployeePayrollService EmployeePayrollService;
        EmployeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmployees));
        EmployeePayrollService.writeData();
    }
}
