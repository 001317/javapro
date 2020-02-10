package com.neuedu.homework1;

public abstract class ColaEmployee {
    public String name;
    public int month;
    public ColaEmployee(){}
    public ColaEmployee(int month){
        this.month=month;
    }
    public abstract int getSalary(int month);

}
