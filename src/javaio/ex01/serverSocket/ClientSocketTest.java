package javaio.ex01.serverSocket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientSocketTest {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("127.0.0.1",50001);
            System.out.println("client start");

            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("client -> server");
            bw.newLine();
            bw.flush();

            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String message = br.readLine();
            System.out.println("client message : " + message);

            System.out.println("client close");
            bw.close();

            socket.close();


        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
