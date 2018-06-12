/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socket;

/**
 *
 * @author milan
 */
import java.net.*;
import java.io.*;


public class client {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("localhost", 9009);
            System.out.println("conneted to client");
       
            DataInputStream in = new DataInputStream(socket.getInputStream());
            String filename= in.readUTF();
            
            File file = new File("/home/desktop");
            int len=in.readInt();
            byte[] b=new byte[len];
            
            BufferedOutputStream out=new BufferedOutputStream(new FileOutputStream(file));
            int count=0;
            while ((count=in.read(b))>0){
                out.write(b,0,count);
        }
        in.close();
        out.close();
        
            System.out .println("file received");
        
        
        } catch (Exception e){
            
        }
    }
    
}
