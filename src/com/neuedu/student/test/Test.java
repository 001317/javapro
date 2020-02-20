package com.neuedu.student.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/student?useUnicode=true&characterEncoding=utf8";
        String username="root";
        String password="root";
        Connection con = null;
        PreparedStatement pstmt = null;
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //创建连接
            con = DriverManager.getConnection(url,username,password);
            //建立接口
            pstmt =  con.prepareStatement("INSERT INTO `student` VALUES ('6','xiaobu', '5', '0')");
            //执行sql语句
            //如果是增删改就用  则用PreparedStatement对象 executeUpdate方法返回int(受影响的行数)
            //如果是查询  则用PreparedStatement对象 executeQuery方法返回ResultSet对象（结果集）
            int i = pstmt.executeUpdate();
            System.out.println(i);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //对于  con 和 PerparedStatement 都是资源  要进行关闭
            try {
                if(pstmt!=null)
                    pstmt.close();
                if(con!=null)
                    con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
