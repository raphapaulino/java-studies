package com.schoolofnet;

//import main.Main;

import com.schoolofnet.default_code.Default;
import com.schoolofnet.private_code.Private;
import com.schoolofnet.protected_code.Protected;
import com.schoolofnet.public_code.Public;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App 
{
    public static void main( String[] args )
    {
//////        new Public();
//////        Private privateClass = new Private();
//////        privateClass.print();
////        new Public();
////        new Private();
//////        new Protected().lastname;
////        new Default();
////        System.out.println( "Hello World!" );
//
////        Object obj = new Object();
////        System.out.println(obj.toString()); // output: java.lang.Object@5674cd4d
//
////        Object obj = new Object();
////        Public publicCode = new Public();
////        System.out.println(obj.toString());
////        System.out.println(publicCode.toString());
//
////        Integer one = 0;
////        int     two = 0;
////        Double d1 = 0.0;
////        String str = d1.toString();
//
////        try {
////            File file = new File("test.txt");
////            if (file.createNewFile()) {
////                System.out.println("File was created!");
////            } else {
////                System.out.println("File already exists!");
////            }
////        } catch (IOException ex) {
////            ex.getStackTrace();
////        }
//
////        File file;
////        FileOutputStream fop = null;
////        try {
////            file = new File("test.txt");
////
////            if (file.createNewFile()) {
////                System.out.println("File was created!");
////            } else {
////                System.out.println("File already exists!");
////            }
////
////            fop = new FileOutputStream(file);
////
////            if (!file.exists()) {
////                file.createNewFile();
////            }
////
////            String text = "Hello. My name is Raphael and I'm working at 633K Technology";
////
////            byte[] textBytes = text.getBytes(); // the text needs to be converted to Bytes
////
////            fop.write(textBytes); // open and write on file
////            fop.flush(); // flush memory
////            fop.close(); // close file permission
////
////            System.out.println("Done");
////
////        } catch (IOException ex) {
////            ex.getStackTrace();
////        }
//
//        File file;
//        FileOutputStream fop = null;
//        FileInputStream fis = null;
//        BufferedReader br = null;
//        BufferedInputStream bis = null;
//
//        try {
//            file = new File("test.txt");
//
//            if (file.createNewFile()) {
//                System.out.println("File was created!");
//            } else {
//                System.out.println("File already exists!");
//            }
//
//            fop = new FileOutputStream(file);
//
//            if (!file.exists()) {
//                file.createNewFile();
//            }
//
//            String text = "Hello. My name is Raphael and I'm working at 633K Technology";
//
//            byte[] textBytes = text.getBytes(); // the text needs to be converted to Bytes
//
//            fop.write(textBytes); // open and write on file
//            fop.flush(); // flush memory
//            fop.close(); // close file permission
//
//            System.out.println("Done");
//
//            // second case about: how to read file content
//            System.out.println("Preparing to read...");
//
//            fis = new FileInputStream(file);
//            bis = new BufferedInputStream(fis);
//            DataInputStream dis = new DataInputStream(bis);
//
//            while(dis.available() != 0) {
//                System.out.println(dis.readLine());
//            }
//
//            fis.close();
//            bis.close();
//            dis.close();
//
//        } catch (IOException ex) {
//            ex.getStackTrace();
//        }
//
////        // first case about: how to read file content
////        try {
////            String currentLine;
////
////            br = new BufferedReader(new FileReader("test.txt"));
////
////            while((currentLine = br.readLine()) != null) {
////                System.out.println(currentLine);
////            }
////
////            if (br != null) {
////                br.close();
////            }
////
////        } catch (IOException ex1) {
////            ex1.printStackTrace();
////        }

//        List<String> list = new ArrayList<String>();
//
//        list.add(0, "Raphael");
//        list.add(1, "Kate");
//        list.add(2, "Max");
//
//        System.out.println(list.toString());
        // Map<key, value>
        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(0, "Raphael");
        map.put(1, "Kate");
        map.put(2, "Max");

        System.out.println(map.toString());
        System.out.println(map.get(0));
        System.out.println(map.values());
        System.out.println(map.remove(1));
    }
}
