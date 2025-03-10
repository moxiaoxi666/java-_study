package net;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * 网络通讯中的客户端
 */
public class Client {
    Socket socket;
    public Client() {
       try {
           socket = new Socket("127.0.0.1", 8088);
       }catch (IOException e){
           e.printStackTrace();
       }
   }
   public void start() throws IOException {
       ObjectOutputStream oos = null;
       try{
       oos = new ObjectOutputStream(socket.getOutputStream());
               oos.writeUTF("hello ,8088");
               oos.flush();;
       }catch (IOException e) {
          e.printStackTrace();
       }finally {
           oos.close();
       }
   }
    public static void main(String[] args) throws IOException {
       Client client1 = new Client();
       client1.start();
    }
}
