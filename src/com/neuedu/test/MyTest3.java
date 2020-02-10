package com.neuedu.test;

public class MyTest3 {
    public static void main(String[] args) {
//        Person p = new Person();
//        System.out.println(p.getAge());
        /*
        * 继承  两个类之间的行为
        * 明确了之子类与父类之间的行为
        *
        * 重写：
        * 必须是两个类，子类定义了与父类完全相同的方法名 返回值类型 参数列表
        *
        * 抽象方法
        *  只有方法的定义，没有方法的代码
        * 子类必须要重写的方法
        * 抽象方法定义在父类中 abstrct
        * 一旦类中有了抽象方法，该类必须定义为抽象类
        * */
        Person p1 = new Person();
        p1.setName("良好");
        System.out.println(p1.getName());

        Dog d1 = new Dog();
        d1.setName("够");
        System.out.println(d1.getName());
        d1.run();
        Student s1= new Student();
        s1.setName("梁宏宇");
        System.out.println(s1.getName());
       s1.run();
       Wang w = new Wang();
       w.teach();
       w.setAge(36);
    }
}
