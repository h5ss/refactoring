package javaio.ex01.serverSocket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketTest {
    public static void main(String[] args) {
        try{
            ServerSocket serverSocket = new ServerSocket(50001);
            System.out.println("server start");
            Socket socket = serverSocket.accept();

            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String message = br.readLine();
            System.out.println("server message : "+ message);

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("server -> client");
            bw.newLine();
            bw.flush();


            System.out.println("server close");
            br.close();
            bw.close();
            socket.close();

        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
