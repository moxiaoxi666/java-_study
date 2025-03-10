package net;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class SimpleChatSever {
        private ServerSocket serverSocket;
        public SimpleChatSever(){
            try{
                serverSocket = new ServerSocket(9999);
                System.out.println("Sever start ok");
            }catch (IOException e) {
                e.printStackTrace();
                //有异常但是没有处理.不会继续执行
                throw  new RuntimeException("服务器启动失败");
            }
        }
        public void start() {
            while(true) {//这里的循环表示可以接受多个客户端
                try {
                    System.out.println("等待链接");
                    Socket socket = serverSocket.accept();
                    System.out.println("客户来了");
                            BufferedReader reader =
                            new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    Scanner scanner = new Scanner(System.in);
                    PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);
                    while(true) {
                        //读数据
                        String line = reader.readLine();
                        System.out.println("客户端读到的数据" + line);
                        //写数据
                        String data = scanner.nextLine();
                        writer.println(data);
                        if("exit".equalsIgnoreCase(line)||"exit".equalsIgnoreCase(data)){
                            writer.flush();
                            writer.close();
                            reader.close();
                        }
                    }
                }catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    public static void main(String[] args) {
        SimpleChatSever sever = new SimpleChatSever();
        sever.start();
    }
}
