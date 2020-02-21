package com.neuedu.student.test;

import com.neuedu.student.bean.Student;
import com.neuedu.student.web.StudentWeb;

public class MyTest1 {
    public static void main(String[] args) {
        StudentWeb studentWeb = new StudentWeb();
        studentWeb.showmain();
        studentWeb.input();
        Student student = new Student();
        student.setId(1);
    }
}
