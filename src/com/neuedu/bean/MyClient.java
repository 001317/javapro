package com.neuedu.bean;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class MyClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",9999);
            System.out.println("客户端连接");
            Scanner sc = new Scanner(System.in);
            OutputStream os = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os);
            while(true){
                String str = sc.nextLine();
                pw.println(str);
                pw.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
