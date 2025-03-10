package thread;

import net.Server;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * 服务器端
 */
class SocketRunnable implements Runnable{
    private Socket socket;
    public SocketRunnable(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            //1.获取输入流,转换为缓冲流
            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            Scanner scanner =new Scanner(System.in);
            //2.输入输出数据
            while(true) {
                //1.写数据
                String data = scanner.nextLine();
                writer.println(data);
                writer.flush();
             //读数据
              String line = reader.readLine();
              System.out.println("接到客户端端的消息:"+line);
                if("exit".equalsIgnoreCase(data))break;
            }
            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
public class SimpleSeverPlus {
    public static void main(String[] args) {
        try {
            //1.创建ServerSocket
            ServerSocket ss = new ServerSocket();
            System.out.println("服务器创建成功");
            //2.绑定端口
            ss.bind(new InetSocketAddress(9999));
            while (true) {
                //3.接受客户端的连接
                Socket socket = ss.accept();
                System.out.println("有客户进行连接");
                //4.创建线程,将socket交给线程
                new Thread(new SocketRunnable(socket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
