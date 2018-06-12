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

public class Socket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            ServerSocket serversocket = new ServerSocket(9009);
            System.out.println("server...started....ready for client");
            
            Socket socket = serversocket.accept();
            System.out.println("client connected:"+ socket.getInetAddress());
           
            File file = new File("");
         
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            String filename=file.get.getName();
            out.writeUTF(filename);
            
            BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
            int len = in.available();
            out.writeInt(len);
            byte[] b=new byte(len);
            in.read(b,0,b.length);
            out.write(b,0,b.lemgth);
            
            in.close();
            out.close();
            System.out.println("file sent");
            
            
            
        }catch(Exception e){
            
        }
    }
    
}
