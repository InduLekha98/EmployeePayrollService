package com.EmployeePayrollService;

public class EmployeePayrollData {
        public int ID;
        public String Name;
        public double Salary;

        public EmployeePayrollData(int ID, String Name, double Salary){
            this.ID = ID;
            this.Name = Name;
            this.Salary = Salary;
        }

        @Override
        public String toString(){
            return "EmployeePayrollData [ID:" +ID+" Name:" +Name+ " Salary:" + Salary+ "]";
        }
    }