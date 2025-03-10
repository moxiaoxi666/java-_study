package net;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 网络通讯中的服务端
 */
public class Server {
    ServerSocket server;
    public Server(int port) {
        //创建服务器对象
        try {
            server = new ServerSocket(port);
            System.out.println("服务器启动成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() throws IOException {
        Socket client = null;
        try {
            //接受客户端的连接,获得客户的信息
            client = server.accept();
            System.out.println("有客户连接");
            try (ObjectInputStream ois = new ObjectInputStream(client.getInputStream())) {
                String str = ois.readUTF();
                System.out.println(str);
            }
        } catch (IOException e) {
                e.printStackTrace();
            }
}


        public static void main (String[]args) throws IOException {
            Server server = new Server(8088);
            server.start();

        }
}