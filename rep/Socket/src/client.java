/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package com.share;

/**
 *
 * @author Bishal
 */
import java.net.*;
import java.io.*;
import static java.lang.Thread.sleep;
public class client {
    public static void main(String[] args) throws InterruptedException {
        while(true){
            try {
           
                Socket socket=new Socket("10.10.30.78",9009);
                System.out.println("connected to server...");
           /// while(true){
               
            
                BufferedOutputStream out;
                
            DataInputStream in = new DataInputStream(socket.getInputStream()) ;
            String filename=in.readUTF();
                File file=new File("/home/milan/Desktop/"+filename);
                int len=in.readInt();
                byte[] b=new byte[len];
                out = new BufferedOutputStream(new FileOutputStream(file));
                int count;
                while((count=in.read(b))>0){
                    out.write(b,0,count);
                }
            //  sleep(0);
               out.close();
               in.close();
            
                System.out.println("file received!");
          //  }
           }
        catch (IOException e) {
        }
    }}
    
}
