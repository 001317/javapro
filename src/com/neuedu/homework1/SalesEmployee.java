package com.neuedu.homework1;
//按月销售额和提成率拿工资的员工
public class SalesEmployee extends ColaEmployee{
    public int salary;
    public float rate;
    public SalesEmployee(int salary, float rate){
        this.salary=salary;
        this.rate=rate;
    }
    @Override
    public int getSalary(int month) {
        return (int) (salary*rate);
    }
}
