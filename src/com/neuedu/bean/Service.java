package com.neuedu.bean;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Service {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(9999);
            //该方法为阻塞
            Socket socket = server.accept();
            System.out.println("客户端已连接");
            InputStream is = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String str = br.readLine();
            while(true){
                System.out.println("客户端说"+str);
                str = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
