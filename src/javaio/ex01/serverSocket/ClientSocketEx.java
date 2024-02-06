package javaio.ex01.serverSocket;

import com.sun.source.tree.Scope;

import java.net.Socket;

public class ClientSocketEx {
    public static void main(String[] args) {
        try{
            Socket socket = new Socket("127.8.0.17",50001);
            socket.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
