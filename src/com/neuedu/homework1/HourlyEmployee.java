package com.neuedu.homework1;
//拿小时工资的员工
public class HourlyEmployee extends ColaEmployee{
    public int salary;
    public HourlyEmployee(int salary,int month){
        this.salary=salary;
        this.month=month;
    }
    @Override
    public int getSalary(int month) {
        if(month>160){
            salary= (int) ((month-160)*salary*1.5);
        }else{
            salary=salary*month;
        }
        return salary;
    }
}
