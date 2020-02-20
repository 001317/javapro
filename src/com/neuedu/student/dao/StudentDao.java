package com.neuedu.student.dao;

import com.neuedu.student.bean.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao implements IstudentDao{
    String url="jdbc:mysql://localhost:3306/student?useUnicode=true&characterEncoding=utf8";
    String username="root";
    String password="root";
    @Override
    public List<Student> query() {

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Student> list = new ArrayList<>();
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //创建连接
            con = DriverManager.getConnection(url,username,password);
            //建立接口
            pstmt = con.prepareStatement("select id,name,age,gender from student");
            //executequery  返回一个ResultSet 结果集
            rs = pstmt.executeQuery();
            //ResultSet 每次调用next()方法
            //看看有没有下一行，如果没有  返回false 如果有将游标推下下一行 返回true
            while(rs.next()){
                Student stu = new Student();
                stu.setId(rs.getInt("id"));
                stu.setName(rs.getString("name"));
                stu.setAge(rs.getInt("age"));
                stu.setGender(rs.getInt("gender"));
                list.add(stu);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(rs!=null)
                    rs.close();
                if(pstmt!=null)
                    pstmt.close();
                if(con!=null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return list;
    }

    @Override
    public int add(Student student) {

        Connection con = null;
        PreparedStatement pstmt = null;

        int i = 0;
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //创建连接
            con = DriverManager.getConnection(url,username,password);
            //建立接口
            pstmt = con.prepareStatement("insert into student(name,age,gender) values (?,?,?)");
            //设置？的值
            pstmt.setString(1,student.getName());
            pstmt.setInt(2,student.getAge());
            pstmt.setInt(3,student.getGender());
            //executequery  返回一个ResultSet 结果集
            i = pstmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(pstmt!=null)
                    pstmt.close();
                if(con!=null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return i;
    }

    @Override
    public int update(Student student) {
        Connection con = null;
        PreparedStatement pstmt = null;
        int i = 0;
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //创建连接
            con = DriverManager.getConnection(url,username,password);
            //建立接口
            pstmt = con.prepareStatement("update student set name=?,age=?,gender=? where id=?");
            //设置？的值
            pstmt.setString(1,student.getName());
            pstmt.setInt(2,student.getAge());
            pstmt.setInt(3,student.getGender());
            pstmt.setInt(4,student.getId());
            //executequery  返回一个ResultSet 结果集
            i = pstmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(pstmt!=null)
                    pstmt.close();
                if(con!=null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return i;

    }

    @Override
    public int del(int id) {
        Connection con = null;
        PreparedStatement pstmt = null;
        int i = 0;
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //创建连接
            con = DriverManager.getConnection(url,username,password);
            //建立接口
            pstmt = con.prepareStatement("delete from student where id=?");
            //设置？的值
            pstmt.setInt(1,id);
            //executequery  返回一个ResultSet 结果集
            i = pstmt.executeUpdate();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if(pstmt!=null)
                    pstmt.close();
                if(con!=null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return i;
    }

    @Override
    public Student queryOne(int id) {
        return null;
    }
}
