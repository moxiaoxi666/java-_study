package thread;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class SimpleClientPlus {
    public static void main(String[] args) {
        try {
            //1.创建Socket
            Socket socket = new Socket();
            //2.连接服务器
            socket.connect(new InetSocketAddress("127.0.0.1",9999));
            //2.连接成功
            System.out.println("连接服务器成功");
            //3.获取输入流,转换为打印流
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            //4.循环从输入台读取,发送给服务器
            Scanner scanner = new Scanner(System.in);
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(socket.getInputStream()));
            while (true){
                //写数据
//                String data = scanner.nextLine();
//                writer.println(data);
//                writer.flush();
                //读数据
                String line = reader.readLine();
                if("exit".equalsIgnoreCase(line))break;
                System.out.println("接收到服务器端的消息:"+ line);
            }
            writer.close();
            reader.close();
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
