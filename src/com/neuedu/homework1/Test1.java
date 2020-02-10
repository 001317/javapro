package com.neuedu.homework1;

public class Test1 {
    public static void main(String[] args) {
        ColaEmployee emp1 = new HourlyEmployee(3000,1);
        ColaEmployee emp2 = new SalariedEmployee(4000);
        ColaEmployee emp3 = new SalesEmployee(5000, (float) 0.5);
        ColaEmployee[] array = new ColaEmployee[]{emp1, emp2, emp3};
       for(int i = 0;i<array.length;i++){
                payWage(array[i],3);
       }
    }
    public static void payWage(ColaEmployee emp,int month){
        System.out.println("月薪"+emp.getSalary(month));
    }
}
