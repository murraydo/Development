package com.muratvatandas.server;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Murat Vatandas
 */
public class Server {

    public static void main(String[] args) {
        Server server = new Server(8000);
        server.startListening();
    }

    private int port;

    public Server(int port) {
        this.port = port;
    }

    public void startListening() {

        new Thread(new Runnable() {
            @Override
            public void run() {

                while (true) {

                    try {
                        System.out.println("[Server] Server starten...");
                        ServerSocket serverSocket = new ServerSocket(port);
                        System.out.println("[Server] Warten auf Verbindung...");
                        Socket remoteClientSocket = serverSocket.accept();
                        System.out.println("[Server] Client verbunden: " + remoteClientSocket.getRemoteSocketAddress());

                        Scanner s = new Scanner(new BufferedReader(new InputStreamReader(remoteClientSocket.getInputStream())));
                        if (s.hasNextLine()) {
                            System.out.println("[Server} Neue Nachricht vom Client: " + s.nextLine());
                        }
                        
                        PrintWriter pw = new PrintWriter(new OutputStreamWriter(remoteClientSocket.getOutputStream()));
                        pw.println("Nachricht wurde erhalten.....");
                        pw.flush();

                        // Verbindung schließen
                        s.close();
                        remoteClientSocket.close();
                        serverSocket.close();

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

}
