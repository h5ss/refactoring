package javaio.ex01.serverSocket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketEx1 {
    public static void main(String[] args) {
        try{
            ServerSocket serverSocket = new ServerSocket(50001);
            System.out.println("server start");
            Socket socket = serverSocket.accept();

            // client 가 보낸 메시지 받기
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String message = br.readLine();
            System.out.println("client message : " + message);

            // client 에 메시지 보내기
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("안녕하세요~");
            bw.newLine();
            bw.flush();

            // 3. 소켓 종료
            socket.close();
            // 서버 소켓 종료
            serverSocket.close();
            System.out.println("server close");
            br.close();
            bw.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
