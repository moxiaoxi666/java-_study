package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SimpleChatClient {
    private Socket socket;
    public SimpleChatClient(){
        try{
            socket = new Socket("127.0.0.1",9999);
            System.out.println("连接成功");

        }catch (IOException e){
            e.printStackTrace();
            throw new RuntimeException("孩子有人已经连接了,请稍后再尝试");
        }
    }
    public void start() throws IOException {
        try{
            PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);
            BufferedReader bufferedReader =
                    new BufferedReader(new InputStreamReader(socket.getInputStream()));
            Scanner scanner = new Scanner(System.in);
            while(true) {
                //写数据
                String data1 = scanner.nextLine();
                writer.println(data1);
                //writer.flush();
                //读数据
                String data2 = bufferedReader.readLine();
                System.out.println("server say " + data2);
                if("exit".equalsIgnoreCase(data1)||"exit".equalsIgnoreCase(data2)){
                    bufferedReader.close();
                    writer.close();
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            socket.close();
        }
    }

    public static void main(String[] args) throws IOException {
        SimpleChatClient client = new SimpleChatClient();
        client.start();
    }
}
