package com.neuedu.bean;

import java.io.*;

public class MyTest12 {
    public static void main(String[] args) {
        //int a = 10;
        Student student = new Student();
        student.getId(10);
        student.setName("张三");
        student.setAge(18);
        student.setGrade("100");
        /*
         *   字节输出流
         *   路径的写法：
         *   File  对象只能提供文件的信息描述   并不能对文件进行读写操作
         *
         * getName()   获取文件的文件名
         * length()  获取文件大小（字节）
         * exists（） 查看文件是否存在
         * getPath()  获取文件路径
         * createNewFile() 创建文件  返回Boolean
         *   如果文件不存在  则可以创建
         *   如果文件已存在不会再创建
         * makdir() 创建目录  只创建目录的最后一级  必须保证前面的父目录是存在的
         * mkdirs() 创建目录
         * delete() 删除文件
         * isFile()  判断是否为文件
         * isDirectory()
         *
         * 流属于对资源进行操作 所以必须进行关闭
         *   在内存和文件之间传输管道
         * write在管道上
         * 输出流  默认将内容写入到文件中，覆盖原文件 如果想保留原先的内容
         * 我们在构造的时候就必须设置为追加内容  而不是覆盖内容
         *
         * 字节输出流：OutputStream
         *
         * 字符输入流：ReaderStream
         *
         *   *
         * */
        File file = new File("d:/abl");
//        System.out.println(file.getName());
//        System.out.println(file.length());
//        System.out.println(file.exists());
//        System.out.println(file.getPath());
//        System.out.println(file.mkdir());
//        //System.out.println(file.delete());
//        System.out.println(file.isFile());
//        System.out.println(file.isDirectory());
//        try {
//            System.out.println(file.createNewFile());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        OutputStream outputStream = null;
//        try {
//            outputStream = new FileOutputStream(file, true);
//            String a = "lhy1234567896652";
//            outputStream.write(a.getBytes());
//            outputStream.flush();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                outputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        }


    /*    try {
            OutputStream outputStream = new FileOutputStream(file,true);
            String a = "\n 1213456789";
            outputStream.write(a.getBytes());//把东西放管道里
            outputStream.flush();//把管道里的东西压入文件中
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

//        InputStream inputStream = null;
//        try {
//            inputStream = new FileInputStream(file);
//            byte[] a = new byte[10];
//            int b = inputStream.read(a);
//            while (b!=-1){
//                System.out.println(new String(a,0,b));
//                b = inputStream.read(a);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                if(inputStream!=null){
//                    inputStream.close();
//                }
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }


      /*  InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(file);
            byte[] a =new byte[10];
            int b = inputStream.read(a);
            while(b!=-1){
                System.out.println(new String(a));
                b = inputStream.read(a);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(inputStream!=null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/

  //      Reader reader = null;
//        BufferedReader bufferedReader = null;
//        try {
//                reader = new FileReader(file);
//                bufferedReader = new BufferedReader(reader);
//                String str = bufferedReader.readLine();
//                while(str!=null){
//                    System.out.println(str);
//                    str = bufferedReader.readLine();
//                }
//               /* char[] a= new char[10];
//                int b = reader.read(a);
//                while(b!=-1){
//                    System.out.println(new String(a,0,b));
//                    b = reader.read(a);
//                }*/
//            }catch (FileNotFoundException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }finally {
//            try {
//                if (bufferedReader!=null){
//                    bufferedReader.close();
//                }
//                if(reader!=null){
//
//                    reader.close();
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }


//        Writer writer = null;
//        try {
//             writer = new FileWriter(file,true);
//             writer.write("sdcsc");
//             writer.flush();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            if(writer!=null){
//                try {
//                    writer.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
    /*
    * 把 d盘下  某个文件  复制到d:/a下
    *
    *
    * */

         // File from = new File("d:/hello.java");
        //File parent = new File("d:/a");
        /*try {
            parent.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }*/


        /*if(!parent.exists()){
            parent.mkdirs();
        }
        File to = new File("d:/a/"+from.getName());
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(from);
            outputStream = new FileOutputStream(to);
            byte[] a= new byte[1024];
               int len =  inputStream.read(a);
               while(len!=-1){
                   outputStream.write(a,0,len);
                   len =  inputStream.read(a);
               }
            }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
                e.printStackTrace();

        } finally {
            if(outputStream!=null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(inputStream!=null){
                try {

                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }*/


        File from = new File("d:/hello.java");
        File parent = new File("d:/b");
        if(!parent.exists()){
            parent.mkdirs();
        }
        File to = new File("d:/b/"+from.getName());
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(to);
            inputStream = new FileInputStream(from);
            byte[] a= new byte[1024];
            int len = inputStream.read(a);
            if(len!=-1){
                outputStream.write(a);
                len = inputStream.read(a);
            }

            }catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();

        } finally {
            if(inputStream!=null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(outputStream!=null){
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


    }

