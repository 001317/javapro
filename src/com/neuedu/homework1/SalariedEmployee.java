package com.neuedu.homework1;
//拿固定工资的员工
public class SalariedEmployee extends ColaEmployee{
    public int salary;
    public SalariedEmployee(int salary){
        this.salary=salary;
    }
    @Override
    public int getSalary(int month) {
        return salary;
    }
}
