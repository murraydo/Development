package com.muratvatandas.client;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Murat Vatandas
 */
public class Client {
    
     public static void main(String[] args) {
         
         Client client = new Client("127.0.0.1", 8000);
         client.sendMessage("Guten Tag Herr Server, ich bin eine Nachricht");
       
    }
     
     private InetSocketAddress address;
     
     public Client(String hostname, int port){
         address = new InetSocketAddress(hostname, port);
     }
     public void sendMessage(String msg){
      
         try{
             System.out.println("[Client] Verbindung zum Server aufbauen......" );
         Socket socket = new Socket();
         socket.connect(address, 10000);
             System.out.println("[Client] Verbindung wurde aufgebaut....");
         
             PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
             pw.println(msg);
             pw.flush();
             System.out.println("[Client] Nachricht an den Server wurde versendet......");
             
             Scanner s = new Scanner(new BufferedReader(new InputStreamReader(socket.getInputStream())));
             if(s.hasNextLine()){
                 System.out.println("[Client] Antwort vom Server: " +s.nextLine());
             }
             
             
             // Verbindung schließen
             pw.close();
             socket.close();
         
         } catch (Exception e){
             e.printStackTrace();
         }
     }

}
